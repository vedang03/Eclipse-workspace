package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int random = rand.nextInt(100);

		int roundCount = 1;
		System.out.println("GAME START");
		System.out.println("Turn: " + roundCount);

		System.out.println("Guess a Number Between 0 to 100: ");
		int number = sc.nextInt();

		boolean isValid = true;

		if (number < 1 || number > 100) {
			System.out.println("Invalid Input");
			roundCount = 0;
			isValid = false;
		}

		while (roundCount != 6) {

			if (number == random) {
				System.out.println("You won in " + roundCount + " rounds");
				break;
			} else if (number > random) {
				roundCount++;
				System.out.println("Turn: " + roundCount);
				if (isValid == true) {
					System.out.println("Guess Lower");
				} else {
					System.out.println("Guess a Number Between 0 to 100: ");
					isValid = true;
				}
				number = sc.nextInt();

			} else {
				roundCount++;
				System.out.println("Turn: " + roundCount);
				if (isValid == true) {
					System.out.println("Guess Higher");
				} else {
					System.out.println("Guess a Number Between 0 to 100: ");
					isValid = true;
				}
				number = sc.nextInt();

			}

		}
		if (number == random && roundCount >= 6) {
			System.out.println("You Won in " + roundCount + " rounds");
		} else if (roundCount >= 6) {
			System.out.println("You Lost");
		}
	}
}
