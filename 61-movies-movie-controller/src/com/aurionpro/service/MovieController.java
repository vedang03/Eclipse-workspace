package com.aurionpro.service;

import java.util.Scanner;

import com.aurionpro.model.Movie;

public class MovieController {
	MovieManager manager;

	public MovieController() {
		manager = new MovieManager();
        
	}
	
	public void start(int option) {
		switch (option) {
		case 1: 
			Scanner sc = new Scanner(System.in);
			int userId = sc.nextInt();
			sc.nextLine();
			String userName = sc.nextLine();
			int userYear = sc.nextInt();
			sc.nextLine();
			String userGenre = sc.nextLine();
			manager.addMovie(new Movie(userId,userName,userYear,userGenre));
			
			break;
		
		case 2: manager.clearMovies();
		        break;
		     
		case 3: System.out.println(manager.getMovies());
		         break;
		
		case 4: 
			Scanner sc1 = new Scanner(System.in);
		    int uid = sc1.nextInt();
			manager.getMovieById(uid);
			break;
		
		case 5:
			Scanner sc2 = new Scanner(System.in);
			int idToBeDeleted = sc2.nextInt();
			manager.deleteMoviesById(idToBeDeleted);
			break;
		

		default:
			System.out.println("Invalid Option");
		
			break;
		}
	}

}
