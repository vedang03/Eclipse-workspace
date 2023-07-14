package com.aurionpro.test;

import com.aurionpro.model.Distance;

public class DistanceTest {

	public static void main(String[] args) {
		Distance d1 = new Distance(4,10);
		Distance d2 = new Distance(7,18);
		Distance d3 = d1.addDistance(d2);
		System.out.println(d3);
	}
	
}
