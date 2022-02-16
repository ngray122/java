package com.gray.booksapi.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gray.booksapi.models.Book;
import com.gray.booksapi.services.BookService;

@Controller
public class BookItemController {
	
	private final BookService bookService;

	public BookItemController(BookService bookService) {
		this.bookService = bookService;
	}
	
////	GET all 
//	@GetMapping("/books")
//	public String index() {
//		System.out.println(this.bookService.allBooks());
//		List<bookItem> allBookItems = this.bookService.allBooks()
//		return "Index.jsp";
//	}

}
