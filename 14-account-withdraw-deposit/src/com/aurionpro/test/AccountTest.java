package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(1,"Vedang",20000,AccountType.Savings);
		
		System.out.println(account);
		deposit(2000, account);
		System.out.println(account);
		withdraw(25000,account);
		System.out.println(account);
			

	}
	private static void deposit(double amount , Account account) {
		double balance = account.getBalance();
		if(balance-amount>0) {
		   balance+=amount;
			account.setBalance(balance);
		}
	}
	
	private static void withdraw(double amount , Account account ) {
		if(AccountType.Savings.equals(account.getAccountType())) {
			if(account.getBalance()-amount>0) {
				double balance = account.getBalance();
				balance-=amount;
				System.out.println("Transaction Successfull");
				account.setBalance(balance);
			} else {
				System.out.println("Insufficient Funds");
			}
		} else {
			if((account.getBalance()-amount)>(-25000)) {
				double balance = account.getBalance();
				balance-=amount;
				System.out.println("Transaction Successfull");
				account.setBalance(balance);
			} else {
				System.out.println("Failed");
			}
		}
	}

}
