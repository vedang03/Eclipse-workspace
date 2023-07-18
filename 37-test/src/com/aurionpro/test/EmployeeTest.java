package com.aurionpro.test;
import com.aurionpro.model.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee m1 = new Manager(1,"Vedang",800000);
		printSalarySlip(m1);
		Employee d1 = new Developer(1,"Tanish",500000);
		printSalarySlip(d1);
		Employee a1 = new Accountant(1,"Aashish",200000);
		printSalarySlip(a1);
		

	}
	
	public static void printSalarySlip(Employee e1) {
		double salary  = e1.getBasic();
		
		System.out.println(e1.calculateAnnualCTC(salary));
	
	}

}
