package com.gray.booksapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gray.booksapi.models.Book;
import com.gray.booksapi.services.BookService;

@RestController
public class BooksApi {

	private final BookService bookService;

	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}

//	GET all 
	@GetMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}

//	create
	@PostMapping("/api/books")
	public Book create(@RequestParam(value = "title") String title, @RequestParam(value = "description") String desc,
			@RequestParam(value = "language") String lang, @RequestParam(value = "pages") Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}

	
//	find one
	@GetMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}

//	update
//	@PutMapping("/api/books/{id}")
//	public Book update(@PathVariable("id") Long id, @RequestParam(value = "title") String title,
//			@RequestParam(value = "description") String desc, @RequestParam(value = "language") String lang,
//			@RequestParam(value = "pages") Integer numOfPages) {
//		Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
//		return book;
//	}
//
//	
////	delete
//	@DeleteMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
//	public void destroy(@PathVariable("id") Long id) {
//		bookService.deleteBook(id);
//	}

}
