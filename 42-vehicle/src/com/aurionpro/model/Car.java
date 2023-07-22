package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle implements IMovable{

	
	public Car(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}
	
	

	public void move() {
		System.out.println("Car is moving");
	}
	
	public void showTopSpeed() {
		System.out.println("Top speed of Car is 140Kmph");
	}




	

}
