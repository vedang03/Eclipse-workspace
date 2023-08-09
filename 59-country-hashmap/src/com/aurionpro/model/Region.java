package com.aurionpro.model;

public class Region {
String regionName;

public Region(String regionName) {
	super();
	this.regionName = regionName;
}

public String getRegionName() {
	return regionName;
}

public void setRegionName(String regionName) {
	this.regionName = regionName;
}

@Override
public String toString() {
	return "Region [regionName=" + regionName + "]";
}



}
