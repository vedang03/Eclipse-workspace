package com.aurionpro.util;

import com.aurionpro.model.Account;

public class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	private Account account;
	private double amount;

	public InsufficientBalanceException(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public String getMessage() {

		return "Insufficient funds:";
	}

	@Override
	public String toString() {
		return "InsufficientBalanceException [Balance=" + account.getBalance() + "]";
	}

}
