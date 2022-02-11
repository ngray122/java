package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("/travel/{city}")
	public String travelCity(@PathVariable(value="city", required=false)String city) {
		if(city == null) {
			return "You did not enter a city";
		} else {
			return String.format("Congratulations! You will soon get to travel to %s!", city);
		}
		
	}
	
	
	@RequestMapping("/lotto/{number}")
	public String lottoNumber(@PathVariable(value="number", required=false)int number) {
		if(number%2==0) {
			return "You will take a grand journey in the near future, but be weary of temping offers.";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends";
		}
	}
	

}