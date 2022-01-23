package com.account.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.account.model.Transaction;
import com.account.model.TransactionRequest;

@FeignClient(name = "gateway-service", url = "http://localhost:8080/")
public interface TransactionServiceProxy {

	@PostMapping("api/transaction/transactions")
	Transaction createTransaction(@RequestBody TransactionRequest transactionRequest);
	
	@GetMapping("api/transaction/transactions")
	List<Transaction> listTransactions();
	
	@GetMapping("/api/transaction/{accountId}")
	List<Transaction> listTransactionsByAccountId(Long accountId);

}
