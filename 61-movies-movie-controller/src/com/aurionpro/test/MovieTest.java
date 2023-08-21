package com.aurionpro.test;

import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

import com.aurionpro.service.MovieController;

public class MovieTest {

	public static void main(String[] args) {
		MovieController controller = new MovieController();
		System.out.println("Welcome!!");
		System.out.println("1 - To add a new movie");
		System.out.println("2 - To delete all the movies");
		System.out.println("3 - To display all the movies");
		System.out.println("4 - To display the movie at specific id");
		System.out.println("5 - To delete the move at specific id");
		System.out.println("6 - Exit");

		System.out.println("What would you like to do?");

		Scanner sc = new Scanner(System.in);

		boolean isStop = false;

		while (isStop == false) {

			int userInput = sc.nextInt();
			if (userInput == 6) {
				isStop = true;
				break;
			} else {
				controller.start(userInput);
				System.out.println("1 - To add a new movie");
				System.out.println("2 - To delete all the movies");
				System.out.println("3 - To display all the movies");
				System.out.println("4 - To display the movie at specific id");
				System.out.println("5 - To delete the move at specific id");
				System.out.println("6 - Exit");

				System.out.println("What would you like to do?");
			}
		}

	}

}
