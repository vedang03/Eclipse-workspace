package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		List<Account>accounts = new ArrayList<>();
		
		accounts.add(new Account(1,"Vedang",30000));
		accounts.add(new Account(2,"Tanish",40000));
		accounts.add(new Account(3,"Aashish",50000));
		
		System.out.println(accounts);
		accounts.remove(1);
		System.out.println(accounts);
		
		for(Account ac : accounts) {
		  System.out.println(ac.getName());
		}
		
		Iterator<Account> iterator = accounts.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getBalance());
		}

	}
}
