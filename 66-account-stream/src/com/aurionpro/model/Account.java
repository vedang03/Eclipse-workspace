package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private String gender;
	private double balance;
	public Account(int id, String name, String gender, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.balance = balance;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", gender=" + gender + ", balance=" + balance + "]";
	}
	
	

}
