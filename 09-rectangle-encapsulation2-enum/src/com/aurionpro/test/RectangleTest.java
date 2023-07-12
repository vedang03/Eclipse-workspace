package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setHeight(20);
		r1.setWidth(10);
		r1.setColour(Color.Blue);

		System.out.println(r1.getHeight() * r1.getWidth() + " Colour is: " + r1.getColour());
	}

}
