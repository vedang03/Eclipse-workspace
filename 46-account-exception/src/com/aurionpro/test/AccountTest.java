package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.util.InsufficientBalanceException;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account(101, "Vedang", 3000);
		System.out.println(account);
		System.out.println("Your account balance before deposit is: " + account.getBalance());
		account.deposit(4000);
		System.out.println("Your account balance is: " + account.getBalance());
		try {
			account.withdraw(500000);
			System.out.println("Your account balance after withdrawal is: " + account.getBalance());
		} catch (InsufficientBalanceException e) {

			System.out.println(e);

		}

	}

}
