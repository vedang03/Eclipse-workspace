package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers);
		System.out.println(numbers.size());

		numbers.remove(1);
		System.out.println(numbers);
		numbers.clear();
		
		System.out.println(numbers);
	}

}
