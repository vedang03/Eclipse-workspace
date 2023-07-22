package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMovable {
	public Bike(String model, LocalDate dom) {
		super(model, dom);
	}

	public void move() {
		System.out.println("Bike is moving");
	}

	public void showTopSpeed() {
		System.out.println("Top speed of Bike is 120Kmph");
	}



}
