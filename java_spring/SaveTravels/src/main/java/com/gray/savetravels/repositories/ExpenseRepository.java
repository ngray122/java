package com.gray.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gray.savetravels.models.Expense;


	
	@Repository
	public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	
	    List<Expense> findAll(); // this method retrieves all the books from the database

	}

