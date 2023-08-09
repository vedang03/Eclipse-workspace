package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class CountryTest {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\vedang.badawe\\Documents\\countryDetails.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String line = br.readLine();

		Map<String, Country> m1 = new HashMap<>();
		while (line != null) {

			String[] arr = line.split(",");
			if (arr.length == 3) {
				String countryId = arr[0].replaceAll("\"", "");
				String name = arr[1].replaceAll("\"", "");
				int code = Integer.parseInt(arr[2].trim());

				m1.put(countryId, new Country(code, name));
			}

			line = br.readLine();
		}
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();

		for (Map.Entry<String, Country> entry : m1.entrySet()) {
			if (entry.getKey().equalsIgnoreCase(userInput)) {
				System.out.println(entry.getValue());
			}
		}
		
//		for(Map.Entry<String,Country>entry:m1.entrySet()) {
//			if(entry.getValue().getCountryCode()==userInput) {
//				System.out.println(entry.getKey()+" - "+entry.getValue().getCountryName());
//				
//				
//			}
//		}
		
		File file2 = new File("C:\\Users\\vedang.badawe\\Documents\\regionDetails.txt");
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		
		String line2 = br2.readLine();
		
		
		Map<Integer,Region>m2 = new HashMap<>();
		while(line2 != null) {
			String[] arr2 = line2.split(",");
			String rName = arr2[1].trim().replaceAll("\"","");
			int rCode = Integer.parseInt(arr2[0].trim());
			m2.put(rCode,new Region(rName));
			line2 = br2.readLine(); 
			
		}
		
//		int userInput2 = sc.nextInt();
//		for(Map.Entry<Integer,Region>entry:m2.entrySet()) {
//			if(entry.getKey()==userInput2) {
//				System.out.println(entry.getValue());
//			}
//			
//		}
	
	}

}
