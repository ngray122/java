package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController

@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Welcome";
		
	}
	
	@RequestMapping("/today")
	public String funnyQuote() {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping("/tomorrow")
	public String inspiriationalQuote() {
		return "Tomorrow, an opportunity";
	}
	

}
