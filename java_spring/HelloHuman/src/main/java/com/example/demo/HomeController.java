package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String helloHuman() {
		return "Hello human";
	}
	
	@RequestMapping("/name")
	public String defaultName(@RequestParam(value="first_name", required=false) String first_name, @RequestParam(value="last_name", required=false) String last_name) {
		System.out.println("THis is the value of the param --> " + first_name + last_name);
		System.out.println(last_name);
		if(first_name ==null) {
			return "This is the default Greeting!";
		} else {
			return String.format("Hi %s, %s", first_name, last_name);
			
		}
	}
	}


