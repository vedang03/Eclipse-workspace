package com.aurionpro.model;

public interface IResources {

	void play();

	void eat();
	
	default void sleep() {
		System.out.println("Person is Sleeping");
	}

	static void work() {
		System.out.println("Person is working");
	}
	
	int number = 22;
	

}
