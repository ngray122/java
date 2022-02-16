package com.gray.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class IndexController {
	
	@GetMapping("/")
	public String indexJsp(HttpSession session) {
		session.setAttribute("count", 0);
		int count = 0;
		if(count == 0) {
			
			
			count++;
			System.out.println("IF count null --> "+ count);
		} else {
			
			System.out.println("Count++ --> "+ count);
		}
		return "index.jsp";
		
		
	}
	
	
	@GetMapping("/counter")
	public String counterJsp() {
		return "viewCounter.jsp";
	}
	

}
