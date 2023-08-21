package com.aurionpro.model;

public class Rectangle {
	private int width;
	private int height;
	private int area;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.area = height * width;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
	
	
	

}
