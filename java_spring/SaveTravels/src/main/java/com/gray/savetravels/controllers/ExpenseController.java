package com.gray.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	
	
//	@GET ALL ROUTE and view
	@GetMapping("/expenses")
	public String index(Model model) {

		List<Expense> expenses = this.expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
//	    passing empty object to form 
		model.addAttribute("newExpenses", new Expense());
		return "ViewAll.jsp";
	}
	
	

//	@POST ROUTE WITH @VALID ANNOTATIONS FOR VALIDATIONS
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
	
	

//	@GET ONE ROUTE - and view 
	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
//      Get info about item using ID in url.  Pre populate form with item information
		Expense expense = this.expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "Edit.jsp";
	}
	
	

  
//	@PUT ROUTE - update
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
	
	
//	@DELETE ROUTE  - delete
    @GetMapping("/expenses/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        expenseService.delete(id);
        return "redirect:/expenses";
    }
    
    
    

//	    // View One Book
	    @GetMapping("/expenses/view/{id}")
	    public String show(Model model, @PathVariable("id") Long id) {
	     
	        Expense expense = expenseService.findExpense(id);
	      //  System.out.println(book);
	        model.addAttribute("expense", expense);
	        return "ViewOne.jsp";
	      }


//	
//	}
//	

}
