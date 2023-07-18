package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Customers;

public class CustomersTest {

	public static void main(String[] args) {
		
		Customers[] c1 = new Customers[3];
		
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
			System.out.println(c1[i].getCustomerID() + c1[i].getName());
		}
		

	}

}
