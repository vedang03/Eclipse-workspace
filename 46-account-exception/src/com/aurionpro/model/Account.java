package com.aurionpro.model;

import com.aurionpro.util.InsufficientBalanceException;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	public double withdraw(double amount) throws InsufficientBalanceException {
		if(balance-amount>1000) {
			balance-=amount;
			return balance;
		}else {
			throw new InsufficientBalanceException(this,amount);
		}
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	

}
