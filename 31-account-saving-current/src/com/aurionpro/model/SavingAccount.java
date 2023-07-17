package com.aurionpro.model;

public class SavingAccount extends Account {
	
	private static  final int MIN_BALANCE = 1000;
    
	

	@Override
	public boolean withdraw(double amount,Account s1){
		double bal = this.getBalance();
		bal-=amount;
		if(bal>MIN_BALANCE) {
			return true;
		}
		return false;
	}
	
		
	

}
