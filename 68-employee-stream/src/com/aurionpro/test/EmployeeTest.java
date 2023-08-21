package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList();
		employees.add(new Employee(1, "Vedang", 30000, "Developer"));
		employees.add(new Employee(2, "Tom", 90000, "HR"));
		employees.add(new Employee(3, "Harry", 80000, "Tester"));
		employees.add(new Employee(4, "Tanish", 30000, "Developer"));
		employees.add(new Employee(5, "Daisy", 60000, "HR"));
		employees.add(new Employee(6, "Aashish", 30000, "Developer"));

		Map<String, List<Employee>> groupEmployeesByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

//		System.out.println(groupEmployeesByDepartment);
		
		Double displaytotalSalary = employees.stream()
		.collect(Collectors.summingDouble(Employee::getSalary));
		
		System.out.println(displaytotalSalary);
		
		long count = employees.stream()
		.filter((i)->i.getSalary()>50000).count();
	
		
		System.out.println(count);
		
		Optional<Employee> min = employees.stream()
		.min(Comparator.comparingDouble(Employee::getSalary));
		
		if(min.isPresent()) {
			System.out.println(min.get());
		}else {
			System.out.println("Not found");
		}
		
		
		
		
		
		

		
		

		
		

	}

}
