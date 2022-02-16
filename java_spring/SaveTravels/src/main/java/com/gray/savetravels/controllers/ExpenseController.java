package com.gray.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.gray.savetravels.models.Expense;
import com.gray.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {

	private final ExpenseService expenseService;

	
//	 dependency injection to access the information in ExpenseService
	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}

	
	
	// View All
	@GetMapping("/expenses")
	public String index(Model model) {

		List<Expense> expenses = this.expenseService.allExpenses();

		model.addAttribute("expenses", expenses);

//	          passing empty object to form 
		model.addAttribute("newExpenses", new Expense());
		return "ViewAll.jsp";
	}

	// Submit new book (with data binding and validation with @Valid annotation)
	@PostMapping("/expenses/create")
	public String create(@Valid @ModelAttribute("newExpenses") Expense expenses, BindingResult result, Model model) {
		if (result.hasErrors()) {

			List<Expense> allExpenses = this.expenseService.allExpenses();
			model.addAttribute("allExpenses", allExpenses);
			return "ViewAll.jsp";
		} else {
			this.expenseService.createExpense(expenses);
			return "redirect:/expenses";
		}

	}


	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
//        	Get info about item using ID in url.  Pre populate form with item information

		Expense expense = this.expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "Edit.jsp";
	}

//        // Submit updates
	@PutMapping("/expenses/update/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("expense") Expense expense,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "Edit.jsp";
		} else {
			System.out.println();
			this.expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}

//	    // View One Book
//	    @GetMapping("/books/{bookId}")
//	    public String show(Model model, @PathVariable("bookId") Long bookId) {
//	      //  System.out.println(bookId);
//	        Book book = bookService.findBook(bookId);
//	      //  System.out.println(book);
//	        model.addAttribute("book", book);
//	        return "show.jsp";
//	      }
//	        // Route to form (without data binding)
//	        @GetMapping("/books/new")
//	        public String newBook() {
//	          return "new.jsp"; // create new jsp file to render form
//	        }
//	        // Route to form (with data binding using @ModelAttribute annotation)
//	        @GetMapping("/books/new")
//	            public String newBook(@ModelAttribute("book") Book book) {
//	            return "new.jsp";
//	            }
//	        // Route to form (with data binding using Model dependency injection)
//	        @GetMapping("/books/new")
//	            public String newBook(Model model) {
//	                model.addAttribute("books", new Book());
//	            return "new.jsp";
//	            }
//	        // Submit new (without data binding)
//	        @PostMapping("/books/submit")
//	        public String create(
//	            @RequestParam("title") String title,
//	            @RequestParam("description") String description,
//	            @RequestParam("language") String language,
//	            @RequestParam("pages") Integer pages) 
//	        {
//	            // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
//	            Book book = new Book(title, description, language, pages);
//	            bookService.createBook(book);
//	            return "redirect:/books";
//	        }
//	        // Submit new book (with data binding and validation with @Valid annotation)
//	        @PostMapping("/books/submit")
//	        public String create(@Valid @ModelAttribute("book") Book book,
//	            BindingResult result) 
//	        {
//	            // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
//	            bookService.createBook(book);
//	            return "redirect:/books";
//	        }

//	        // Delete a book
//	        @DeleteMapping("/books/{bookId}")
//	        public String destroy(@PathVariable("bookId") Long bookId) {
//	            bookService.delete(bookId);
//	            return "redirect:/books";
//	        }
//	}
//	

}
