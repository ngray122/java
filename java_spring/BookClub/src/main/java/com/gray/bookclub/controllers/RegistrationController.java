package com.gray.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gray.bookclub.models.Book;
import com.gray.bookclub.models.LoginUser;
import com.gray.bookclub.models.User;
import com.gray.bookclub.services.BookService;
import com.gray.bookclub.services.RegistrationService;

@Controller
public class RegistrationController {
	// Add once service is implemented:

	@Autowired
	private RegistrationService regServ;
	
	@Autowired
	private BookService bookServ;

	@GetMapping("/")
	public String index(Model model) {

		// Bind empty User and LoginUser objects to JSP. Empty objects capture form
		// input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "login.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

//		 I am passing in the user obj from form along with result. Sending to service 
		User user = this.regServ.register(newUser, result);

		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.
			model.addAttribute("newLogin", new LoginUser());
			return "login.jsp";
		}

		session.setAttribute("loggedIn", user.getId());
		return "redirect:/home";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {

		// Add once service is implemented:
		User user = regServ.login(newLogin, result);

		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "login.jsp";
		} else {
			session.setAttribute("loggedIn", user.getId());
			return "redirect:/home";
		}
	}

	@GetMapping("/home")
	public String successfulLogin(HttpSession session, Model model) {
		Long id = (Long) session.getAttribute("loggedIn");
		if (id == null) {
			return "redirect:/";
		}
		User loggedInUser = this.regServ.findOneUer(id);
		model.addAttribute("loggedInUser", loggedInUser);
		List<Book> allBooks = this.bookServ.findAllBooks();
		model.addAttribute("allBooks", allBooks);
		
		return "dashboard.jsp";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();

		return "redirect:/";
	}
	

}
