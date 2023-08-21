package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NamesTest {

	public static void main(String[] args) throws FileNotFoundException {
//		String[] names = {"Tom","Harry","Daisy","Robert"};
//		
//		 Stream<String> namesStream = Stream.of(names);  // converting string to stream
//		 
//		 namesStream.forEach(System.out::println);
		
		
		//Taking input from text doc and printing the lines using filereader.
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vedang.badawe\\Documents\\names.txt"));
		StringBuilder sb = new StringBuilder();
		
		try {
			String line = br.readLine();
			while(line!=null) {
				sb.append(line).append("\n");	
				
				line = br.readLine();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String fileAsString = sb.toString();
       Stream<String>fileStream = Stream.of(fileAsString);
//     
       fileStream.forEach(System.out::println);
//		
//		String[] names = {"Jay","Nimesh","Mark","Mahesh","Ramesh"};
//		List<String> top3Ascending = Stream.of(names)
//				                   .sorted(Comparator.reverseOrder())
//				                   .limit(3)
//				                   .collect(Collectors.toList());
////		top3Ascending.forEach(System.out::println);
//		
//		char a = 'a';
//		List<String> sortTop3Havinga = Stream.of(names)
//		.filter(n->n.contains(String.valueOf(a)))
//		.limit(3)
//		.collect(Collectors.toList());
//		
////		sortTop3Havinga.forEach(System.out::println);
//		
//		List<String> displayFirst3Chars = Stream.of(names)
//		.map(n->n.substring(0,3))
//		.collect(Collectors.toList());
//		
////		displayFirst3Chars.forEach(System.out::println);
//		
//		
//		List<String> displayNamesLessThan4 = Stream.of(names)
//		.filter(n->n.length()<=4)
//		.collect(Collectors.toList());
//		
//		displayNamesLessThan4.forEach(System.out::println);
//		
		
		
		 
		 
				                
		
	}

}
