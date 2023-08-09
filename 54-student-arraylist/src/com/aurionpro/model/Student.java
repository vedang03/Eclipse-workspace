package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
int StudentId;
String studentName;
double percentage;
public Student(int studentId, String studentName, double percentage) {
	super();
	StudentId = studentId;
	this.studentName = studentName;
	this.percentage = percentage;
}
public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", percentage=" + percentage + "]";
}

public static Student getTopper(List<Student>students){
    Student temp=null;
	double max = 0;
	for(Student s:students) {
		if(s.getPercentage()>max) {
			max = s.getPercentage();
			temp=s;
		}
	}
	return temp;
}

public static Student getLeastSccorer(List<Student>students) {
	Student temp = null;
	double low = 100;
	for(Student s: students) {
		if(s.getPercentage()<low) {
			low = s.getPercentage();
			temp = s;
		}
	}
	return temp;
}
public static List<Student> sortByPercentage(List<Student>students){
	students.sort(Comparator.comparingDouble(Student::getPercentage).reversed());
	return students;
}
}

