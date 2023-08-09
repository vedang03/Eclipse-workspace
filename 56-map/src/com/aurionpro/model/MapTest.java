package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer,String>map = new HashMap<>();
		
		map.put(1,"Vedang");
		map.put(3,"tanish");
		map.put(2,"Aashish");
		
		map.remove(2);
		
	
		
//		Set<Entry<Integer, String>> entrySet = map.entrySet();
//		for(Entry x : entrySet) {
//			System.out.println(x.getKey() + " " + x.getValue());
//		}
		
//		map.forEach((key,value)->{
//			System.out.println(key + " -> " + value);
//		});
//		
		for(Map.Entry<Integer,String>entry: map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
