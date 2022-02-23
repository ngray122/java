package com.gray.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.gray.bookclub.models.Book;
import com.gray.bookclub.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookServ;

//	----> View Create Form <----
	@GetMapping("/books/new")
	public String addBookForm(Model model, HttpSession session) {
//		Empty Book obj for form
		model.addAttribute("book", new Book());
//		pass logged in user to the form.  Use session member variable from LOGIN method and create hidden input on .jsp form
//		
		Long idOfSession = (Long)session.getAttribute("loggedIn");
//		add session id (Long) to form
		model.addAttribute("idOfSession", idOfSession);
		return "addBook.jsp";
	}

//	----> Post Create Form <----
	@PostMapping("/books/create")
	public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("Err for create => " + result);
			return "addBook.jsp";
		} else {
			this.bookServ.addNewBook(book);
			return "redirect:/home";
		}

	}
	
//	----> View One Book <----
	@GetMapping("/books/detail/{id}")
	public String viewOne(@PathVariable("id") Long id, Model model,  HttpSession session) {
		
		Long idOfSession = (Long)session.getAttribute("loggedIn");
//		add session id (Long) to form
		model.addAttribute("idOfSession", idOfSession);
		
		Book singleBook = this.bookServ.viewOne(id);
		model.addAttribute("singleBook", singleBook);

		return "viewOne.jsp";

	}
	
	
	
//	----> View Edit Book Form <----
	@GetMapping("/books/edit/{id}")
	public String viewEdit(@PathVariable("id") Long id, Model model, HttpSession session) {
		
		Long idOfSession = (Long)session.getAttribute("loggedIn");
//		add session id (Long) to form
		model.addAttribute("idOfSession", idOfSession);
		
		Book book = bookServ.viewOne(id);
		model.addAttribute("editDetailsForm", book);
		
//		Book editDetailsForm = this.bookServ.viewOne(id);
//		model.addAttribute("editDetailsForm", editDetailsForm);
	

		return "editBook.jsp";

	}
	
	
//	----> Put/Update Book <----
	@PutMapping("/books/update/{id}")
	public String updateBook(@Valid @ModelAttribute("editDetailsForm") Book book, BindingResult result) {

		if (result.hasErrors()) {
			return "editBook.jsp";
		} else {
			this.bookServ.updateBook(book);
			return "redirect:/home";
		}

	}
	
//	----> Delete One Book <----
	@GetMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		this.bookServ.deleteOne(id);
		return "redirect:/home";
		
	}

}
