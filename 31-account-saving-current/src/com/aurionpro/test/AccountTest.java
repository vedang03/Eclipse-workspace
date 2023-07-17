package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
     
		SavingAccount s1 = new SavingAccount();
		s1.setId(1);
		s1.setName("Vedang");
		s1.setBalance(2000);
      CurrentAccount c1 = new CurrentAccount();
   
      if(s1.deposit(2000)==true) {
    	  System.out.println("Deposit Successful");
      }else {
    	  System.out.println("Invalid");
      }
      System.out.println(s1.getBalance());
      
      if(s1.withdraw(2000,s1)==true) {
    	  System.out.println("Success");
      }else {
    	  System.out.println("Failed");
      }
      if(c1.withdraw(40000, s1)) {
    	  System.out.println("Sucess");
      }else {
    	  System.out.println("failed");
      }
      
	}
	

}
