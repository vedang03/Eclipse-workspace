package com.aurionpro.model;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person {
    public Student(int id, String address, LocalDate dob) {
		super(id, address, dob);
		// TODO Auto-generated constructor stub
	}

	private String branch;
}
