package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private double balance;

	
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
	public boolean withdraw(double amount,Account c1) {
		
		return true;
	}

}
