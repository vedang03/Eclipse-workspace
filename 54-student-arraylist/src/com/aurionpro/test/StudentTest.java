package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
      List<Student>students = new ArrayList<Student>();
      students.add(new Student(1,"Vedang",89));
      students.add(new Student(2,"Tanish",98));
      students.add(new Student(3,"Aashish",92.4));
//      
//      System.out.println(Student.getTopper(students));
//      System.out.println(Student.getLeastSccorer(students));
      
//      for(Student s: students) {
//    	  System.out.println(s);
//      }
      students.sort(Comparator.comparing(Student::getStudentName));
      for(Student s:students) {
    	  System.out.println(s);
      }
      
	}
	
}
