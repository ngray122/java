package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String helloworld(Model model) {
//		importing modle class and creating instance of it
		
		
		String movieTitle = "Nemo";
		String releaseDate = "1997";
		String imageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixar.fandom.com%2Fwiki%2FNemo&psig=AOvVaw0Tkw3Bdljqj6UNrBSh7hUu&ust=1644702475728000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCLjluKjQ-PUCFQAAAAAdAAAAABAF";
		
		model.addAttribute("movie", movieTitle);
		model.addAttribute("rd", releaseDate);
		model.addAttribute("url", imageUrl);
		
		ArrayList<Actor>castOfActors = new ArrayList();
		
		
		
		return "index.jsp";
	}

}
