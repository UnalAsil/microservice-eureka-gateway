package com.account.model;

public class TransactionRequest {
	private Long accountId;
	private long amount;

	public TransactionRequest() {
	}

	public TransactionRequest(Long accountId, long amount) {
		this.accountId = accountId;
		this.amount = amount;
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
}
