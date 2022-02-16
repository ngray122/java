package com.gray.ninjagoldgame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		
//		"your gold" in session
//		4 different buttons that increment/decrement gold amount 
		
		
		
//		ifninja ===  (onlick)farms
//			else if ninja ===  (onlick)cave  cpin +5
//				else if ninja ===  (onlick)house  coin + 5
		
		return "Main.jsp";
	}

		
}
