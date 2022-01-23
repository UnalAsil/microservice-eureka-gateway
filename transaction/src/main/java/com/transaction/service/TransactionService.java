package com.transaction.service;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.model.Transaction;
import com.transaction.model.TransactionRequest;
import com.transaction.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository transactionRepo;
	
	public Transaction saveTransaction(TransactionRequest transactionRequest) {
		Long accountId = transactionRequest.getAccountId();
		long amount = transactionRequest.getAmount();
		Calendar date = Calendar.getInstance();
		
		//TODO->Check arguments.
		
		Transaction transaction = new Transaction(accountId, amount, date);
		return transactionRepo.save(transaction);
	}
	
	public List<Transaction> listTransactions(){
		return transactionRepo.findAll();
	}
	
	public List<Transaction> listTransactionsByAccountId(Long accountId){
		return transactionRepo.findByAccountId(accountId);
	}
}
