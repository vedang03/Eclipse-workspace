package com.aurionpro.test;

import java.util.Scanner;
import java.util.function.Consumer;

import com.aurionpro.model.IAddddable;
import com.aurionpro.model.IGreetable;
import com.aurionpro.model.WelcomeGreetings;

public class LambdaTest {

	public static void main(String[] args) {
		IGreetable obj = new WelcomeGreetings();

		obj.printGreetings();

		IGreetable obj2 = new IGreetable() { // using anonymous class

			@Override
			public void printGreetings() {
				System.out.println("Bye, Have a Good day");
			}
		};
		
		IGreetable obj3 = ()-> System.out.println("Lambda"); // using lambda function
		obj3.printGreetings();
		obj2.printGreetings();

		IAddddable add = LambdaTest::subtraction; // using function
		System.out.println(add.operation(30, 20));
		

	}

	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}

}
