package com.aurionpro.model;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private double productDiscountedPercent;
	private double productDiscountedPrice;
	public Product(int productId, String productName, double productPrice, double productDiscountedPercent) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDiscountedPercent = productDiscountedPercent;
		this.productDiscountedPrice=calculateDiscountedPrice();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductDiscountedPercent() {
		return productDiscountedPercent;
	}
	public void setProductDiscountedPercent(double productDiscountedPercent) {
		this.productDiscountedPercent = productDiscountedPercent;
	}
	public double calculateDiscountedPrice() {
		
		return this.productPrice- ((this.productPrice * this.productDiscountedPercent)/100);
		
		
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDiscountedPercent=" + productDiscountedPercent + "]";
	}
	
	
	
	

}
