	package com.aurionpro.model;

public class Vehicle {
	String companyName;
	String typeOfModel;
	double dom;
	public Vehicle(String companyName, String typeOfModel, double dom) {
		super();
		this.companyName = companyName;
		this.typeOfModel = typeOfModel;
		this.dom = dom;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTypeOfModel() {
		return typeOfModel;
	}
	public void setTypeOfModel(String typeOfModel) {
		this.typeOfModel = typeOfModel;
	}
	public double getDom() {
		return dom;
	}
	public void setDom(double dom) {
		this.dom = dom;
	}
	
	


	
	
	
	
}
