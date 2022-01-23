package com.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.model.Transaction;
import com.transaction.model.TransactionRequest;
import com.transaction.service.TransactionService;

@RestController
@RequestMapping("api/transaction/transactions")
public class TransactionController {
	@Autowired
	TransactionService transactionService;

	@GetMapping
	private List<Transaction> getAllCustomers() {
		return transactionService.listTransactions();
	}

	@PostMapping
	private Transaction saveCustomer(@RequestBody TransactionRequest transactionRequest) {
		return transactionService.saveTransaction(transactionRequest);
	}
}
