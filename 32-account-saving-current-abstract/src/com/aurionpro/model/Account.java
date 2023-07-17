package com.aurionpro.model;

public abstract class Account {
	protected int id;
	protected String name;
	protected double balance;

	
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
	
	public boolean deposit(double amount) {
		if(amount>0) {
			return true;
		}else
			return false;
	}
	public abstract boolean withdraw(double amount);
		
	
	

}
