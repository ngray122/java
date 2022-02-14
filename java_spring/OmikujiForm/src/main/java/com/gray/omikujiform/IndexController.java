package com.gray.omikujiform;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller("/omikuji")
public class IndexController {
	
	
//	@ GET ROUTE 
	@GetMapping("/")
	public String index() {
		return "index.jsp";
		
	}
	
	
	
//	@ POST ROUTE for form submission
	@PostMapping("/submitForm")
	public String show(
			
			@RequestParam("num") Integer num,
			@RequestParam("city") String city,
			@RequestParam("name") String name,
			@RequestParam("hobby") String hobby,
			@RequestParam("thing") String thing,
			@RequestParam("enterTextArea") String enterTextArea,
			HttpSession session
			){
		session.setAttribute("formNum", num);
		session.setAttribute("formCity", city);
		session.setAttribute("formName", name);
		session.setAttribute("formHobby", hobby);
		session.setAttribute("formThing", thing);
		session.setAttribute("formEnterTextArea", enterTextArea);
		
//		System.out.println("Num is --> " + num);
//		System.out.println("City is --> " + city);
//		System.out.println("Name is --> " + name);
//		System.out.println("Hobby is --> " + hobby);
//		System.out.println("Text Area is --> " + enterTextArea);
		return "redirect:/show";
	}
	
	
	@GetMapping("/show")
	public String showDetails() {
		return "show.jsp";
	}

}
