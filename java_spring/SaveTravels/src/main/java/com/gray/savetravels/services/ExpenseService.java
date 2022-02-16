package com.gray.savetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gray.savetravels.models.Expense;
import com.gray.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;

	//	Constructor
	//			 Dependency Injection for Repository
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	// get all
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}

	// create
	public Expense createExpense(Expense b) {
		return expenseRepository.save(b);
	}

	// get one
	public Expense findExpense(Long id) {
		return this.expenseRepository.findById(id).orElse(null);
	}

	//	update
	public Expense updateExpense(Expense expense) {
		return this.expenseRepository.save(expense);
	}

	//	delete
	public void delete(Long id) {
		this.expenseRepository.deleteById(id);
	}
}
