package com.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.model.Account;
import com.account.model.NewAccountRequest;
import com.account.model.TransactionRequest;
import com.account.proxy.TransactionServiceProxy;
import com.account.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepo;

	@Autowired
	TransactionServiceProxy transactionServiceProxy;

	public Account saveAccount(NewAccountRequest newAccountRequest) {

		Long customerId = newAccountRequest.getCustomerId();
		long initialCredit = newAccountRequest.getInitialCredit();
		Account account = accountRepo.save(new Account(customerId, initialCredit));

		if (initialCredit != 0) {
			transactionServiceProxy.createTransaction(new TransactionRequest(account.getId(), initialCredit));
		}
		return account;
	}

	public Optional<Account> fetcAccountById(Long id) {
		return accountRepo.findById(id);
	}

	public List<Account> listAccounts() {
		return accountRepo.findAll();
	}
}
