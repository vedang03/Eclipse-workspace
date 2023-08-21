package com.aurionpro.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Movie;

public class MovieManager {

	List<Movie> movies;
	static final String filePath = "C:\\Users\\vedang.badawe\\Documents\\training\\61-movies-movie-controller\\data.bin";

	public MovieManager() {
		movies = new ArrayList<>();
		loadMovies();
	}

	public void addMovie(Movie movie) {
		boolean isIdExist = false;
		
		for(Movie x: movies) {
			if(x.getId() == movie.getId()) {
			  isIdExist = true;
			}
		}
		if(isIdExist) {
			System.out.println("Id must be unique");
		}else {
		movies.add(movie);
		saveMovies();
		}
	}

	public void clearMovies() {

		movies.clear();
		System.out.println();
		saveMovies();
	}

	public List<Movie> getMovies() {

		return movies;
	}

	public void getMovieById(int id) {
		for (Movie m : movies) {
			if (m.getId() == id) {
				System.out.println(m.getName());
			}
		}
		saveMovies();

	}
	
	public void deleteMoviesById(int id) {
		Movie temp = null;
		for(Movie m : movies) {
			if(m.getId()==id) {
				temp = m;
			}
		}
		movies.remove(temp);
		saveMovies();
	}

	private void loadMovies() {
		try {
			FileInputStream file = new FileInputStream(filePath);
			ObjectInputStream in = new ObjectInputStream(file);

			movies = (List<Movie>) in.readObject();
			in.close();
			file.close();

//			for(Movie x : movies) {
//				System.out.println(x);
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void saveMovies() {
		try {
			FileOutputStream file = new FileOutputStream(filePath);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(movies);
			out.close();
			file.close();
			loadMovies();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
