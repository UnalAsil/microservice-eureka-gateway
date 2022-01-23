package com.account.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.model.Account;
import com.account.model.NewAccountRequest;
import com.account.repository.AccountRepository;


@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepo;

	public Account saveAccount(NewAccountRequest newAccountRequest) {

		Long customerId = newAccountRequest.getCustomerId();
		long initialCredit = newAccountRequest.getInitialCredit();
		if (initialCredit != 0) {
			//TODO->Make a transaction call.
		}
		Account account = new Account(customerId, initialCredit);
		return accountRepo.save(account);
	}

	public Optional<Account> fetcAccountById(Long id) {
		return accountRepo.findById(id);
	}

	public List<Account> listAccounts() {
		return accountRepo.findAll();
	}
}
