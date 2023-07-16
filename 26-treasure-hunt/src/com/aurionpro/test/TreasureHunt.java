package com.aurionpro.test;
import java.util.Scanner;


public class TreasureHunt {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Treasure Island. Your mission is to "
				+ "find the treasure.");
		
		System.out.println("Left or Right?: ");
		String direction = sc.nextLine();
		
		if(direction.equalsIgnoreCase("Right")) {
			System.out.println("Fall into the hole. Game Over");
			
		} else {
			System.out.println("Swim or Wait?");
			String action = sc.nextLine();
			
			if(action.equalsIgnoreCase("Swim")) {
				System.out.println("Attacked by Trout. Game Over");
			} else {
				System.out.println("Which Door?");
				String colour = sc.nextLine();
				if(colour.equalsIgnoreCase("Red")) {
					System.out.println("Burned by fire. Game Over");
				} else if(colour.equalsIgnoreCase("Blue")) {
					System.out.println("Eaten by Beasts. Game Over");
				} else if(colour.equalsIgnoreCase("Yellow")) {
					System.out.println("You Win!!!");
				} else {
					System.out.println("Game Over.");
				}
			}
		}

	}

}
