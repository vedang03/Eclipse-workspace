package com.aurionpro.model;

import java.time.LocalDate;

public class Bus extends Vehicle implements IMovable{
	
	
	
	public Bus(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	public void move() {
		System.out.println("Bus is moving");
	}
	
	public void showTopSpeed() {
		System.out.println("Top speed of Bus is 70Kmph");
	}


	
	

}
