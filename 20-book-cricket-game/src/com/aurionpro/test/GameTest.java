package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.Game;

public class GameTest {

	public static void main(String[] args) {

		Game p1 = new Game();
		Game p2 = new Game();

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rounds1 = 0;
		System.out.println("Enter 1 to start game and 0 to exit: ");
		String start = sc.next();
		if(start.equals("0")) {
			System.out.println("Game End!!");
		} else {
		System.out.println("Enter Player 1 Name:");
		p1.setName(sc.next());

		System.out.println("Enter Player 2 Name:");
		p2.setName(sc.next());

		System.out.println("Player: " + p1.getName());

		do {
			System.out.println("Enter 1 to open the book");
			String input = sc.next();
			if (input.equals("1")) {
				p1.setPageNumber(rand.nextInt(300));
				p1.setPoint(p1.getPageNumber() % 7);
				p1.setScore(p1.getPoint() + p1.getScore());
				System.out.println("Page Number: " + p1.getPageNumber() + " " + "Point: " + p1.getPoint() + " "
						+ "Score: " + p1.getScore());
				rounds1++;
			}
		} while (p1.getPoint() != 0);
		int target = p1.getScore() + 1;
		System.out.println(p1.getName() + " total score: " + p1.getScore());
		System.out.println(p1.getName() + " takes " + rounds1 + " rounds.");
		System.out.println(p2.getName() + " needs " + target + " in " + rounds1 + " rounds to win");

		int rounds2 = 0;

		System.out.println("Player: " + p2.getName());
		do {
			if(p2.getScore()>p1.getScore() || rounds2>rounds1 ) {
				break;
			}else {

			System.out.println("Enter 1 to open the book");
			String input = sc.next();
			if (input.equals("1")) {
				p2.setPageNumber(rand.nextInt(300));
				p2.setPoint(p2.getPageNumber() % 7);
				p2.setScore(p2.getPoint() + p2.getScore());
				System.out.println("Page Number: " + p2.getPageNumber() + " " + "Point: " + p2.getPoint() + " "
						+ "Score: " + p2.getScore());
				rounds2++;

			}
			}
		} while(p2.getPoint()!=0);
		if (p2.getScore() > p1.getScore()) {
			System.out.println(p2.getName() + " won match!!");
		} else {
			System.out.println(p1.getName() + " won match!!");
		}
	}
	}

}
