package com.aurionpro.model;

public class CurrentAccount extends Account {
	private static  final int OVER_DRAFT = 25000;
	
	@Override
  public boolean withdraw(double amount , Account s1) {
		double bal = this.getBalance();
		if(bal-amount>-OVER_DRAFT) {
			return true;
		}
		return false;
	}
}
