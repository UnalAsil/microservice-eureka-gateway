package com.account.model;

public class NewAccountRequest {
	private Long customerId;
	private long initialCredit;
	
	public NewAccountRequest() {
	
	}
	public NewAccountRequest(Long customerId, long initialCredit) {
		this.customerId = customerId;
		this.initialCredit = initialCredit;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public long getInitialCredit() {
		return initialCredit;
	}
	public void setInitialCredit(long initialCredit) {
		this.initialCredit = initialCredit;
	}
}
