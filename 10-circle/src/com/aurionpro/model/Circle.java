package com.aurionpro.model;

public class Circle {
	private double radius;
	private Colour colour;
	private Border border;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public Colour getColour() {
		return colour;
	}

	public void setBorder(Border border) {
		this.border = border;
	}

	public Border getBorder() {
		return border;
	}

	public double calculateArea() {
		return Math.PI * (radius * radius);
	}

	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

}
