package com.deguzman.Real.Estate.Tracker.API.dao;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.deguzman.Real.Estate.Tracker.API.financial_models.Expense;

public interface ExpenseDao {

	public List<Expense> getAllExpenseInformation();
	
	public List<Expense> getExpensesByIncurredDate(Date incurredDate);
	
	public List<Expense> getExpensesByPaymentDate(Date paymentDate);
	
	public ResponseEntity<Expense> getExpenseById(long expenseId);
	
	public int addExpense(Expense expense);
	
	public int updateExpenseInformation(long expenseId, Expense expenseInfor);
	
	public int deleteExpenseInformation(long expenseId);
}
