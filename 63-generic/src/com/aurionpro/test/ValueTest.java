package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Value;

public class ValueTest {

	public static void main(String[] args) {
//		Value<Float> v1 = new Value<Float>(2.1f);
//		v1.print();
//		Value<String> v2 = new Value<String>("Vedang");
//		v2.print();
//		Value<Rectangle> v3 = new Value<Rectangle>(new Rectangle(6,9));
//		v3.print();
		printValues("Hiii", new Rectangle(6, 7));
		List<Integer>newList = Arrays.asList(1,2,3,4,5);
		printList1(newList);

	}
	private static <T,S> void printValues(T value1 , S value2){
		System.out.println(value1 + " " + value2);
	}
	private static<T>  void printList1(List<T>list) {
		for(T x:list) {
			System.out.println(x);
		}
	}
	private static  void printList2(List<?>list) { // we can also print the values using a wildcard(?).
		for(Object x:list) {
			System.out.println(x);
		}
	}
	}


