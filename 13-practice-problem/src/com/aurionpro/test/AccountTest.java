package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.Highlighter.Highlight;

public  class AccountTest {
	

	public static void main(String[] args) {
		Account[] account = new Account[3];
		
		for(int i=0;i<account.length;i++) {
			account[i] = new Account();
			setAccountDetails(account[i]);
			
		}
		 
		System.out.println(maxBalance(account));
		
		
		System.out.println("Savings: " + maxBalanceofType(account , AccountType.Savings));
		System.out.println("Current: "+ maxBalanceofType(account , AccountType.Current));
		System.out.println(totalBalance(account));
		System.out.println(totalBalanceOfType(account,AccountType.Savings));
		System.out.println(totalBalanceOfType(account , AccountType.Current));
		sortBalance(account);
		for(int i=0;i<account.length;i++) {
			System.out.println(account[i]);
		}
	}
	


		public static void setAccountDetails(Account account) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account details: ");
		account.setId(sc.nextInt());
		account.setName(sc.next());
		account.setBalance(sc.nextDouble());
		account.setAccountType(AccountType.valueOf(sc.next()));
		
	
		
	}
		public static Account maxBalance(Account []account) {
			Account maxAccount = account[0];
			for(int i=0;i<account.length;i++) {
				if(account[i].getBalance()>maxAccount.getBalance()) {
					maxAccount = account[i];
				}
			}
			return maxAccount;
			
		}
		
		public static Account maxBalanceofType(Account[] account ,AccountType accountType ) {
			Account maxAccount = null;
			for (int i = 0; i < account.length; i++) {
				if(maxAccount ==null && account[i].getAccountType().equals(accountType)) {
					maxAccount = account[i];
				}
				
				if(maxAccount != null && account[i].getAccountType().equals(accountType) && 
						account[i].getBalance()>maxAccount.getBalance()) {
					maxAccount = account[i];
				}
			}
			return maxAccount;
		}
		
		public static double totalBalance(Account[] account) {
			double total = 0;
			for (int i = 0; i < account.length; i++) {
				total = total + account[i].getBalance();
			}
			return total;
		}
		
		public static double totalBalanceOfType(Account[] account,AccountType accountType) {
			double total = 0;
			for (int i = 0; i < account.length; i++) {
				if(account[i].getAccountType().equals(accountType)) {
				total = total + account[i].getBalance();
				}
			}
			return total;
		}
		
		public static void sortBalance(Account[] account) {
			Account temp = null;
			
			for(int i=0;i<account.length;i++) {
				for(int j=i+1 ; j<account.length;j++) {
					if(account[i].getBalance()<account[j].getBalance()) {
					temp=account[i];
					account[i]=account[j];
					account[j]=temp;
				}
			}
			}
			
		}
		
		
		
		
	
		

}
