package com.aurionpro.java;

import java.util.Scanner;

public class LongestSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input;

		System.out.println("Enter a String: ");
		input = sc.next();
		int longestSequence = 0;
		int sequence = 0;
		
		for(int i=0;i<input.length();i++) {
			sequence=0;
			for(int j=i+1;j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) {
					sequence++;
				}
				if(sequence > longestSequence) {
					longestSequence=sequence;
				}
			}
			
		}
		System.out.println(longestSequence);

	}
}
//abbcccdq