package com.aurionpro.test;

import java.util.Iterator;

import com.aurionpro.model.City;
import com.aurionpro.model.SalesPerson;

public class SalesPersonTest {

	public static void main(String[] args) {
		SalesPerson[] salesPerson = { new SalesPerson(1, "Vedang", City.Banglore, 3, 400000),
				new SalesPerson(1, "Virat", City.Banglore, 10, 80000),
				new SalesPerson(1, "Dhoni", City.Mumbai, 12, 90000),
				new SalesPerson(1, "Tanish", City.Mumbai, 1, 20000), new SalesPerson(1, "Aashish", City.Pune, 4, 50000)

		};

		System.out.println(highestSales(salesPerson));
		System.out.println(totalSalesAmount(salesPerson));
		System.out.println(salesAmountByCity(salesPerson, City.Mumbai));
		System.out.println(highestSalesByCity(salesPerson, City.Mumbai));

	}

	public static SalesPerson highestSales(SalesPerson[] salesPerson) {
		SalesPerson highest = salesPerson[0];
		for (int i = 0; i < salesPerson.length; i++) {
			if (salesPerson[i].getSalesAmount() > highest.getSalesAmount()) {
				highest = salesPerson[i];
			}
		}
		return highest;
	}

	public static double totalSalesAmount(SalesPerson[] salesPerson) {
		double total = 0;
		for (int i = 0; i < salesPerson.length; i++) {
			total += salesPerson[i].getSalesAmount();
		}
		return total;
	}

	public static double salesAmountByCity(SalesPerson[] salesPerson, City city) {

		double total = 0;
		for (int i = 0; i < salesPerson.length; i++) {
			if (salesPerson[i].getCity().equals(city)) {
				total += salesPerson[i].getSalesAmount();
			}
		}
		return total;
	}

	public static SalesPerson highestSalesByCity(SalesPerson[] salesPersons, City city) {
		SalesPerson highest = salesPersons[0];

		double high = 0;
		for (int i = 0; i < salesPersons.length; i++) {

			if (salesPersons[i].getSalesAmount() > high && salesPersons[i].getCity().equals(city)) {
				highest = salesPersons[i];
				high = salesPersons[i].getSalesAmount();

			}
		}
		return highest;
	}

}
