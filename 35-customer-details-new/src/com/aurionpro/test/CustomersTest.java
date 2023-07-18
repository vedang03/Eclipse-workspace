package com.aurionpro.test;

import java.util.Iterator;
import java.util.Scanner;

import com.aurionpro.model.Customers;

public class CustomersTest {

	public static void main(String[] args) {

		Customers[] c1 = new Customers[2];

		for (int i = 0; i < c1.length; i++) {
			c1[i] = new Customers();
		}

		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c1.length; i++) {

			c1[i].setCustomerID(sc.nextInt());
			c1[i].setName(sc.next());
			c1[i].setEmail(sc.next());
			c1[i].setPassword(sc.nextInt());
		}

		for (int i = 0; i < c1.length; i++) {
			if (validateEmail(c1[i]) == true)
				System.out.println(c1[i]);
		}
		sortArray(c1);

	}
	
	private static void sortArray(Customers[] customer) {
		Customers temp = null;
		 for (int i = 0; i < customer.length; i++) {
			for (int j = 0; j < customer.length; j++) {
				
			
				if(customer[i].getName().compareToIgnoreCase(customer[j].getName())<0) {
					temp = customer[i];
					customer[i]=customer[j];
					customer[j]=temp;
				
			
			}
			}
		 }
	}
		

	public static boolean validateEmail(Customers c1) {
		int check1 = 0, check2 = 0;

		check1 = c1.getEmail().indexOf("@");
		check2 = c1.getEmail().indexOf(".com");

		if (check1 != -1 && check2 != -1) {
			return true;
		}
		return false;
	}

}
