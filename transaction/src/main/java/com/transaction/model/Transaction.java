package com.transaction.model;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	// TODO-> If Transaction and Account will be different services(like micro
		// service) then we should use separate Classes even they hold some
		// information(Domain Driven Design).

		// TODO->Even we can consider abstraction of spring. When we implement our
		// Domain. We can use API and SPI to usage Spring.
		@Id
		@GeneratedValue
		private Long id;
		private Long accountId;
		private long amount;
		private Calendar date;
		// TODO-Destination, source ??

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
