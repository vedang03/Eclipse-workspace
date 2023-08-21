package com.aurionpro.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DeleteUser {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
     Map<Integer,String>freq = new HashMap<>();
     
     freq.put(1, "Vedang");
     freq.put(2, "Tanish");
     freq.put(3, "Aashish");
     freq.put(2, "Tom");
     
     System.out.println(freq);
     
     String userInput = sc.next();
     int k = 0;
     
     
     for(Map.Entry<Integer,String>entry : freq.entrySet()) {
    	 if(entry.getValue().equals(userInput)) {
    		 k = entry.getKey();
   
    	 }
     }
     
     freq.remove(k);
     

     
     freq.forEach((key,value)->{
    	 System.out.println(key + " " + value);
     });
    
	}
	

}
