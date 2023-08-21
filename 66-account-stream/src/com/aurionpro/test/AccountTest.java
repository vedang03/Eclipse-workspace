package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> account = new ArrayList<>();
		account.add(new Account(1, "Vedang", "Male", 40000));
		account.add(new Account(2, "Tom", "Male", 40000));
		account.add(new Account(1, "Daisy", "Female", 150000));
		account.add(new Account(1, "Harry", "Male", 20000));

		List<Account> collectMales = account.stream()
				.filter((name) -> (name.getGender()=="Male")).collect(Collectors.toList());
		
		
		List<Account> collectFemales =  account.stream()
				.filter((name) -> (name.getGender().equalsIgnoreCase("female"))).collect(Collectors.toList());

		List<Account> collectBalanceOverOneLakh =  account.stream()
				.filter((name) -> (name.getBalance() >= 100000)).collect(Collectors.toList());
		
		List<Double> displayAllBalances = account.stream()
		.map((accounts)->accounts.getBalance())
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(displayAllBalances);
		
		List<Account> sortBalances = account.stream()
		.sorted(Comparator.comparing(Account::getBalance).reversed())
		.limit(3)
		.collect(Collectors.toList());
		
//		sortBalances.forEach(System.out::println);
		
		List<String> displayNameOfTop3Balances = sortBalances.stream()
		.map((accounts)->accounts.getName())
		

		.collect(Collectors.toList());
		
//		System.out.println(displayNameOfTop3Balances);

		

	}

}
