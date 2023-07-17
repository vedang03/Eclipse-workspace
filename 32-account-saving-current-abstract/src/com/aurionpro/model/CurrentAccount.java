package com.aurionpro.model;

public class  CurrentAccount extends Account {
	private static  final int OVER_DRAFT = 25000;
	
	@Override
  public boolean withdraw(double amount) {
		double bal = balance;
		if(bal-amount>-OVER_DRAFT) {
			return true;
		}
		return false;
	}
}
