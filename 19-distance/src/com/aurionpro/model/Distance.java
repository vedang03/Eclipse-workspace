package com.aurionpro.model;

public class Distance {
	int feet;
	int inches;
	
	
	
	public Distance(int feet, int inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}

	public Distance() {
		super();
	}

	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}
	
	public Distance addDistance(Distance d) {
		Distance temp = new Distance();
		
		
		if(this.getInches() + d.getInches() >12) {
			temp.setInches((this.getInches() + d.getInches())%12);
			temp.setFeet((this.getFeet() + d.getFeet())+1);
			
		}
		return temp;
		
	}
	
	
	

}
