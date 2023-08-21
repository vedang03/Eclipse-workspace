package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		List<Student>students = new ArrayList();
		
		students.add(new Student(1,"Vedang",88.4,Arrays.asList("Cricket","Writing","Cricket")));
		students.add(new Student(2,"Tom",90.8,Arrays.asList("Reading","singing")));
		students.add(new Student(3,"Smith",68.01,Arrays.asList("Cricket","Sleeping")));
		students.add(new Student(4,"Ronaldo",77.8,Arrays.asList("Football","Gym")));
		students.add(new Student(5,"Newton",99.99,Arrays.asList("Reading","Writing")));
		
		
		
		
		List<Student> displayTop3Marks = students.stream()
		.sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
		.limit(3)
		.collect(Collectors.toList());
		
		displayTop3Marks.forEach(System.out::println);
		
		
		List<String> displayHobbies = students.stream()
		.map((h)->h.getHobbies())
		.flatMap((list)->list.stream())
		.distinct()
		.collect(Collectors.toList());
		
		displayHobbies.forEach(System.out::println);
		
	
		


	}

}
