package com.gray.savetravels.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gray.savetravels.models.Expense;
import com.gray.savetravels.repositories.ExpenseRepository;


@Service
public class ExpenseService {
	
	 private final ExpenseRepository expenseRepository;
	    // Constructor
//	 Dependency Injection for Repository
	    public ExpenseService(ExpenseRepository expenseRepository) {
	      this.expenseRepository = expenseRepository;
	    }

	    // retrieves all 
	    public List<Expense> allExpenses() {
	        return expenseRepository.findAll();
	    }
	    // create
	    public Expense createExpense(Expense b) {
	        return expenseRepository.save(b);
	    }
	    
	    
	    
	
	    
	    
	    
//	    // retrieves a book if it exists (optional)
//	    public Book findBook(Long id) {
//	        Optional<Book> optionalBook = expenseRepository.findById(id);
//	        if (optionalBook.isPresent()) {
//	            return optionalBook.get();
//	        } else {
//	            return null;
//	        }
//	    }
//	    public Book updateBook(Book book, Long id) {
//	        Optional<Book> optionalBook = expenseRepository.findById(id);
//	        if (optionalBook.isPresent()) {
//	        Book book1 = optionalBook.get();
//	        book1.setTitle(book.getTitle());
//	        book1.setDescription(book.getDescription());
//	        book1.setLanguage(book.getLanguage());
//	        book1.setNumberOfPages(book.getNumberOfPages());
//	            return expenseRepository.save(book1);
//	        } else {
//	            return null;
//	        } 
//	    }
//	    // delete a book
//	    public String delete(Long id) {
//	        Optional<Book> optionalBook = expenseRepository.findById(id);
//	        if (optionalBook.isPresent()) {
//	        	expenseRepository.deleteById(id);
//	            return "Deleted";
//	        } else {
//	            return "No book to delete";
//	        }
//	    }
}
