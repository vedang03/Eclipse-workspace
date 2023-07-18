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
	@Override
	public  double calculateSalary(double salary) {
		
		double ctc = salary * 12;
		return ctc;
		
	}
	@Override
	public String toString() {
		return "Professor [id="+getId()+ ", Address= "+getAddress() + " , dateofbirth: "+getDob() + "salary= " + salary + "]";
	}
		

	
	
	
	
	

}
