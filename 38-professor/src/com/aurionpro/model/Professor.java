package com.aurionpro.model;

import java.time.LocalDate;
import java.util.Date;

public  class Professor extends Person implements SalariedEmployee  {
	private double salary;

	public Professor(int id, String address, LocalDate dob , double salary) {
		super(id, address, dob , salary);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public  double calculateSalary(double salary) {
		
		double ctc = salary * 12;
		return ctc;
		
	}
	@Override
	public String toString() {
		return "Professor [id="+getId()+ ", Address= "+getAddress() + " , dateofbirth: "+getDob() + " salary= " + salary + "]";
	}
		

	
	
	
	
	

}
