	package com.aurionpro.model;

public class Price extends Milege {
	double price;

	public Price(String companyName, String typeOfModel, double dom,double milege,double price) {
		super(companyName, typeOfModel, dom, milege);
	    this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [price=" + price + ", milege=" + milege + ", companyName=" + companyName + ", typeOfModel="
				+ typeOfModel + ", dom=" + dom + ",]";
	}


	
	

}
