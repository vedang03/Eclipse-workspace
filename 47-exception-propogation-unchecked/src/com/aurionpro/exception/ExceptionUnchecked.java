package com.aurionpro.exception;

public class ExceptionUnchecked {

	public static void main(String[] args) {

		System.out.println("Main start");
		function1();
		System.out.println("Main end");

	}

	public static void function1() {
		System.out.println("f1 start");
		try {
			function2();
		} catch (RuntimeException e) {
			System.out.println("Exception handelled");
		}
		System.out.println("f1 end");
	}

	public static void function2() {
		System.out.println("f2 start");
		function3();
		System.out.println("f2 end");
	}

	public static void function3() {
		System.out.println("f3 start");
		function4();
		System.out.println("f3 end");
	}

	public static void function4() {
		System.out.println("f4 start");
		throw new RuntimeException();
	}

}
