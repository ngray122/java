package com.gray.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gray.bookclub.models.Book;
import com.gray.bookclub.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
//	show all service
	public List<Book> findAllBooks(){
		return (List<Book>) this.bookRepo.findAll();
	}
	
	
//	add new book
	public Book addNewBook(Book b) {
		return this.bookRepo.save(b);
	}
	
	
	public Book updateBook(Book b) {
		return this.bookRepo.save(b);
	}
	
	
//	find one by id
	public Book viewOne(Long id) {
		return this.bookRepo.findById(id).orElse(null);
	}
	
//	delete by id
	public void deleteOne(Long id) {
		this.bookRepo.deleteById(id);
	}
}