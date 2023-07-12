package com.aurionpro.model;


public class Rectangle {
	
	private double height;
	private double width;
	private Color colour;
	
	

	public void setHeight(double height) {

		this.height = correctValue(height);
	}

	public double getHeight() {

		return height;
	}

	public void setWidth(double width) {
		this.width = correctValue(width);

	}

	public double getWidth() {
		return width;
	}

	private double correctValue(double value) {
		if (value < 1) {
			value = 1;
		} else if (value > 100) {
			value = 100;
		}

		return value;

	}

	public void setColour(Color colour) {
		
			this.colour = colour;
		
	}

	public Color getColour() {
		return colour;
	}
	
	

}
