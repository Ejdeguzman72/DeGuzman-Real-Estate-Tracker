package com.deguzman.Real.Estate.Tracker.API.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.deguzman.Real.Estate.Tracker.API.financial_models.Transaction;

public interface TransactionDao {

	public List<Transaction> getAllTransactionInformation();
	
	public List<Transaction> getTransactionsByType(int transactionTypeId);
	
	public List<Transaction> getTransactionsByProperty(long propertyId);
	
	public ResponseEntity<Transaction> getTransactionInfoById(long transactionId);
	
	public int addTransactionInformation(Transaction transactionInfo);
	
	public int updateTransactionInformation(long transactionId, Transaction transactionDetails);
	
	public int deleteTransactionInformation(long transactionId);
	
}
