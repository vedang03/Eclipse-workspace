package com.aurionpro.model;

public class Account {
	private  int id;
	private  String name;
	private  double balance;
	private  AccountType accountType;
	private static int count;
	
	
	
	public Account(int id, String name, double balance, AccountType accountType) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
		count++;
	}
	
	
	public Account() {
		super();
		count++;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public int getCount() {
		return count;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", accountType=" + accountType + "]";
	}

	

}
