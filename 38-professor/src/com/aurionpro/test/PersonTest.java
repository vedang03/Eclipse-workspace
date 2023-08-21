package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Person;
import com.aurionpro.model.Professor;

public class PersonTest {

	public static void main(String[] args) {
     
      Professor p = new Professor(2,"Thane",LocalDate.of(1999,04,14),50000);
      System.out.println(p);
     System.out.println( p.calculateSalary(p.getSalary()));
	}

}
