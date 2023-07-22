package com.aurionpro.test;

public class ExceptionTest {

	public static void main(String[] args) {
		try {

		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		int div = first/second;
		System.out.println(div);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handelled");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handelled");
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException handelled");
		}finally {
			System.out.println("Inside Finally");
		}
		System.out.println("After exception handelling");
	}


}
