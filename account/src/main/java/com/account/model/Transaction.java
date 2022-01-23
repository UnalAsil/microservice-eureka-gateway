package com.account.model;

import java.util.Calendar;

public class Transaction {
	private Long accountId;
	private long amount;
	private Calendar date;

	public Transaction() {

	}

	public Transaction(Long accountId, long amount, Calendar date) {
		this.accountId = accountId;
		this.amount = amount;
		this.date = date;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
}
