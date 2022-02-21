package com.gray.login_reg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gray.login_reg.models.LoginUser;
import com.gray.login_reg.models.User;
import com.gray.login_reg.services.UserService;


@Controller
public class HomeController {
 
 // Add once service is implemented:
  @Autowired
  private UserService userServ;
 
 @GetMapping("/")
 public String index(Model model) {
 
     // Bind empty User and LoginUser objects to JSP.  Empty objects capture form input
     model.addAttribute("newUser", new User());
     model.addAttribute("newLogin", new LoginUser());
     return "index.jsp";
 }
 
 @PostMapping("/register")
 public String register(@Valid @ModelAttribute("newUser") User newUser, 
         BindingResult result, Model model, HttpSession session) {
     
     // TO-DO Later -- call a register method in the service 
     // to do some extra validations and create a new user!
//	 I am passing in the user obj from form along with result. Sending to service 
	 User user = this.userServ.register(newUser, result);
     
     if(result.hasErrors()) {
         // Be sure to send in the empty LoginUser before 
         // re-rendering the page.
         model.addAttribute("newLogin", new LoginUser());
         return "index.jsp";
     }
     
     // No errors! 
     // TO-DO Later: Store their ID from the DB in session, 
     // in other words, log them in.
     session.setAttribute("loggedIn", user.getId());
     return "redirect:/home";
 }
 
 @PostMapping("/login")
 public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
         BindingResult result, Model model, HttpSession session) {
     
     // Add once service is implemented:
      User user = userServ.login(newLogin, result);
 
     if(result.hasErrors()) {
         model.addAttribute("newUser", new User());
         return "index.jsp";
     } else {
    	 session.setAttribute("loggedIn", user.getId());
    	 return "redirect:/home";
     }
 
     // No errors! 
     // TO-DO Later: Store their ID from the DB in session, 
     // in other words, log them in.
 
    
 }
 
 @GetMapping("/home")
 public String successfulLogin(HttpSession session, Model model) {
	Long id = (Long) session.getAttribute("loggedIn");
	if(id == null) {
		return "redirect:/";
	}
	User loggedInUser = this.userServ.findOneUer(id);
	model.addAttribute("loggedInUser", loggedInUser);
     return "dashboard.jsp";
 }
 
 @GetMapping("/logout")
 public String logout(HttpSession session) {
	 session.invalidate();
	 
	 return "redirect:/";
 }
 
 
 
}

