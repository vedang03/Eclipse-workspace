package com.aurionpro.test;

import com.aurionpro.model.Price;

public class VehicleTest {

	public static void main(String[] args) {
		Price[] vehicles = { new Price("BMW","Top model",2019,8.9,8000000),
				new Price("Audi","Base model",2022,10,4000000),
				new Price("Tata","Electric model",2021,16,2000000),
				
		};
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i]);
		}
	
	}

}
