package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;
import com.aurionpro.model.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		IMovable[] movables = { new Car("Compass", LocalDate.of(2019, 03, 12)),
				new Bike("RTR 200", LocalDate.of(2021, 02, 11)), new Bus("Volvo", LocalDate.of(2016, 07, 29)) };
		for (int i = 0; i < movables.length; i++) {

			startMoving(movables[i]);

		}

	}

	public static void startMoving(IMovable vehicle) {
		vehicle.move();
		System.out.println(vehicle);
		Vehicle obj = (Vehicle) vehicle;
		obj.showTopSpeed();

	}

}
