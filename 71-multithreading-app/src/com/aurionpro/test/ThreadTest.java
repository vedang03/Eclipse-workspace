package com.aurionpro.test;

import com.aurionpro.model.PrintNumber;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("Main Start");
		PrintNumber t1 = new PrintNumber();
		t1.start();
	    t1.setPriority(9);
		
		PrintNumber t2 = new PrintNumber();
		t2.start();
		
		
		System.out.println("Main end");

	}

}
