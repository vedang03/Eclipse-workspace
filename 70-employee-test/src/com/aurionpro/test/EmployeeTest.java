package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\vedang.badawe\\Downloads\\emp.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = br.readLine();

		
//		Find all employees in a department
		
//		Map<Integer,Employee>m2 = new HashMap<>();
//		while(line!=null) {
//			String[] arr = line.split(",");
//			if(arr.length==8) {
//				String edep = arr[2].replaceAll("'", "");
//				int employeeId = Integer.parseInt(arr[0]);
//				String ename = arr[1].replaceAll("'", "");
//				
//				m2.put(employeeId, new Employee(ename, edep));
//				
//			}
//			
//			line = br.readLine();
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		String department = sc.next();
		
//		for(Map.Entry<Integer,Employee>entry : m2.entrySet()) {
//			if(entry.getValue().getEmployeeDepartment().equalsIgnoreCase(department)) {
//				System.out.println(entry.getValue().getEmployeeName());
//			}
//		}
// ------------------------------------------------------------------------------------------------------
//		 Find count of employees in each department
		
//		Map<Integer,Employee>m2 = new HashMap<>();
//		while(line!=null) {
//			String[] arr = line.split(",");
//			if(arr.length==8) {
//				String edep = arr[2].replaceAll("'", "");
//				int employeeId = Integer.parseInt(arr[0]);
//				String ename = arr[1].replaceAll("'", "");
//				
//				m2.put(employeeId, new Employee(ename, edep));
//				
//			}
//			
//			line = br.readLine();
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		String department = sc.next();
//		int employeeCount = 0;
//			for(Map.Entry<Integer,Employee>entry : m2.entrySet()) {
//			if(entry.getValue().getEmployeeDepartment().equalsIgnoreCase(department)) {
//				employeeCount++;
//			}
//		}
//			System.out.println(employeeCount);
		
// -----------------------------------------------------------------------------------------------------
		
//		Find the immediate manager of the employee
		
//		Map<String,Employee>m2 = new HashMap<>();
//		
//		while(line!=null) {
//			String[] arr = line.split(",");
//			if(arr.length==8) {
//				int mid = Integer.parseInt(arr[3]);
//				
//				String ename = arr[1].replaceAll("'", "");
//				int employeeId = Integer.parseInt(arr[0]);
//				
//				m2.put(ename, new Employee(employeeId, mid));
//				
//			}
//			
//			line = br.readLine();
//		}
//		Scanner sc = new Scanner(System.in);
//		String employee = sc.next();
//		
//		for(Map.Entry<String,Employee>entry:m2.entrySet()) {
//			if(entry.getKey().equalsIgnoreCase(employee)) {
//
//				int temp = entry.getValue().getManagerid();
//			
//				for(Map.Entry<String,Employee>entry2:m2.entrySet()) {
//					
//				if(entry2.getValue().getEmployeeid()==temp) {
//					System.out.println(entry2.getKey());
//				}
//				}
//			}
//		}

// --------------------------------------------------------------------------------------------------------
		
//		 Find highest paid employee in each department
		
//		Map<String,Employee>m2 = new HashMap<>();
//		
//		while(line!=null) {
//			String[] arr = line.split(",");
//			if(arr.length==8) {
//				String ename = arr[1].replaceAll("'", "");
//				String dep = arr[2].replaceAll("'", "");
//				double salary = Double.parseDouble(arr[5]);
//				
//				m2.put(ename, new Employee(dep, salary));
//				
//			}
//			
//			line = br.readLine();
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		String department = sc.next();
//		 List<Double>employees = new ArrayList<>();
//		for(Map.Entry<String,Employee>entry:m2.entrySet()) {
//			if(entry.getValue().getEmployeeDepartment().equalsIgnoreCase(department)) {
//			
//			 employees.add(entry.getValue().getEmployeeSalary());
//			}
//		}
//		 int sum = employees.stream().mapToInt(Double::intValue).sum();
//	        System.out.println("Sum of all employees in: "sum);
//	 
// ---------------------------------------------------------------------------------------------------
//		Find highest paid employee on each role
		
		Map<String,Employee>m2 = new HashMap<>();
		
		while(line!=null) {
		String[] arr = line.split(",");
		if(arr.length==8) {
			String ename = arr[1].replaceAll("'", "");
			String dep = arr[2].replaceAll("'", "");
			double salary = Double.parseDouble(arr[5]);
			
			m2.put(ename, new Employee(dep, salary));
			
		}
		
		line = br.readLine();
	}
		Scanner sc = new Scanner(System.in);
		String department = sc.next();
		List<Double>employees = new ArrayList<>();
		for(Map.Entry<String,Employee>entry:m2.entrySet()) {
		if(entry.getValue().getEmployeeDepartment().equalsIgnoreCase(department)) {
		
		 employees.add(entry.getValue().getEmployeeSalary());
		}
	}
	
		Double calsal = Collections.max(employees);
		
		
		for(Map.Entry<String,Employee>entry:m2.entrySet()) {
			if(entry.getValue().getEmployeeSalary()==calsal) {
				System.out.println("Employee with highest salary in "+entry.getValue().getEmployeeDepartment() +
						" is "+entry.getKey());
			}
		}


	}

}
