package com.aurionpro.test;

import com.aurionpro.model.Student;


public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 03;
		s1.name = "Vedang";
		s1.email = "vedang@gmail.com";
		s1.percentage = 88.40;
		System.out.println("Id: "+s1.id + " , Name: "+ s1.name + " , EmailId: "
		                    +s1.email+ " , Percentage: "+ s1.percentage);
		

	}

}
