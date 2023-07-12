package com.aurionpro.test;

import com.aurionpro.model.Border;
import com.aurionpro.model.Circle;
import com.aurionpro.model.Colour;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();

		c1.setRadius(3);
		c1.setColour(Colour.Red);
		c1.setBorder(Border.Solid);

		System.out.println("Area is: " + c1.calculateArea() + " , " + " Perimeter is " + c1.calculatePerimeter() + " , "
				+ " Colour is: " + c1.getColour() + " , " + " Border is: " + c1.getBorder());

	}

}
