package com.aurionpro.util;

import java.util.Scanner;


public class ValidateAgeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			AgeUtil.validateAge(age);
		} catch(InValidAgeException e) {
			System.out.println(e.getMessage());
		}
		

}
	}
