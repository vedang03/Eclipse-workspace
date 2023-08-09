package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class OccuranceOfNumber {
public static void main(String[] args) {
	List<Integer>nums = Arrays.asList(20,40,10,30,20,40,30,10,40,40,20);
	
	Map<Integer,Integer>freq = new HashMap<>();
	
	for(Integer x : nums) {
		if(freq.containsKey(x)) {
			
			freq.put(x,freq.get(x)+1);
		}else {
			freq.put(x,1);
		}
	}
Set<Entry<Integer, Integer>> entrySet = freq.entrySet();

int max = 0;
int key=0;
for (Entry<Integer, Integer> entry : entrySet) {
	if(entry.getValue()>max) {
		max = entry.getValue();
		key = entry.getKey();
	}
}
System.out.println(max);

	System.out.println(freq);
}
}
