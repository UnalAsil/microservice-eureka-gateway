package com.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Account;
import com.account.model.NewAccountRequest;
import com.account.service.AccountService;


@RestController
@RequestMapping("api/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping
	private List<Account> listAccounts() {
		return accountService.listAccounts();
	}

	@PostMapping
	private Account saveAccount(@RequestBody NewAccountRequest accountRequest) {
		return accountService.saveAccount(accountRequest);
	}

	
}
