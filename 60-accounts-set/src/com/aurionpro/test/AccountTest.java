package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Set<Account>accounts = new HashSet<>();
		accounts.add(new Account(1,"Vedang"));
		accounts.add(new Account(1,"Tom"));
		
		System.out.println(accounts);

	}

}
