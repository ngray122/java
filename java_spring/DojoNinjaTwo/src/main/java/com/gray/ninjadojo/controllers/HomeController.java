package com.gray.ninjadojo.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gray.ninjadojo.models.Dojo;
import com.gray.ninjadojo.models.Ninja;
import com.gray.ninjadojo.services.HomeService;

@Controller
public class HomeController {
	
	private final HomeService homeService;
	
	
	
	public HomeController(HomeService homeService) {
		super();
		this.homeService = homeService;
	}


	@GetMapping("/")
	public String index(Model model) {
		
		List<Dojo> dojoWithNinja = this.homeService.getallDojos();
 		model.addAttribute("dojoWithNinja", dojoWithNinja);

		model.addAttribute("dojo", new Dojo());
		return "addDojo.jsp";
	}
	
	
	@PostMapping("/dojo/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Err --> " + result);

			return "addDojo.jsp";
		} else {
			this.homeService.createDojo(dojo);
			System.out.println("Creating --> " + dojo);
			return "redirect:/ninja/new";
		}

	}

	@GetMapping("/ninja/new")
	public String createNinjaForm(Model model) {

		model.addAttribute("ninja", new Ninja());
		model.addAttribute("allDojos", this.homeService.getallDojos());
		
		return "addNinja.jsp";
	}
	
	

	@PostMapping("/ninja/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			
			System.out.println("Err --> " + result);
			model.addAttribute("allDojos", homeService.getallDojos());
			return "addNinja.jsp";
		} else {
			System.out.println("Creating --> " + ninja);
			this.homeService.createNinja(ninja);
			return "redirect:/";
		}

	}
	
	@GetMapping("/dojos/{id}")
	public String viewAll(@PathVariable("id") Long id, Model model) {
		
		Dojo dojoWithNinja = this.homeService.getOne(id);

		model.addAttribute("dojoWithNinja", dojoWithNinja);
	
		return "view.jsp";
	}
	

}
