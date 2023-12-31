package com.aurionpro.test;

import com.aurionpro.model.Color;

import com.aurionpro.model.Rectangle;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		
		
		Rectangle[] rectangle = new Rectangle[2];
		
		for(int i=0;i<rectangle.length;i++) {
			rectangle[i] = new Rectangle();
			setRectangleValues(rectangle[i]);
		}
		
		for(int i=0;i<rectangle.length;i++) {
			printRectangleValues(rectangle[i]);
		}

	}

	public static void setRectangleValues(Rectangle rectangle) {
		Scanner sc = new Scanner(System.in);
		rectangle.setHeight(sc.nextDouble());
		rectangle.setWidth(sc.nextDouble());

		try {
			rectangle.setColour(Color.valueOf(sc.next().toUpperCase()));
		}

		catch (Exception e) {
			rectangle.setColour(Color.RED);
		}
	}

	public static void printRectangleValues(Rectangle rectangle) {
		System.out.println(rectangle.getHeight() * rectangle.getWidth() + " The colour is: " + rectangle.getColour());
	}

}
