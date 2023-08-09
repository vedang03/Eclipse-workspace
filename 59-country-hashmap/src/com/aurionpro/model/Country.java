package com.aurionpro.model;

public class Country {
	int countryCode;
	String countryName;
	public Country(int countryCode, String countryName) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}

	

}
