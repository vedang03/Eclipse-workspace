package com.aurionpro.test;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int number = sc.nextInt();
	 int digit;
	 int factorial = 1;
	 
	 while(number>0) {
		 factorial = factorial * number;
		 number--;
	 }
	 
	 System.out.println("Factorial of number is: " +factorial);

	}

}
