package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
	   List<String>str = new ArrayList<>();
	   
	   str.add("Vedang");
	   str.add("Tom");
	   str.add("Ram");
	   str.add("Josh");
	   
		
//		List<String>ans = new ArrayList<>(); // normal filtering
//		for(String x:str) {
//			if(x.length()==3 || x.length()==4) {
//				ans.add(x);
//			}
//		}
//		System.out.println(ans);
	   
//	   Arrays.stream(str) //filtering using stream API without using stream collectors
//	   .filter((name)->(name.length()==3 || name.length()==4))
//	   .forEach((name)->System.out.println(name));
////		
		List<String> collectName = str.stream() // filtering using stream API using stream collectors.
				                   .filter((name)->(name.length()==3 || name.length()==4))
				                   .collect(Collectors.toList());
				     collectName.stream().forEach((name)->System.out.println(name));

	}

}
