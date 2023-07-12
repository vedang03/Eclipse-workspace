package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.height = 10;
        r1.width = 10;
        
        Rectangle r2 = new Rectangle();
        r2.height = 20;
        r2.width = 10;
  
       
        
        System.out.println(r2.calculateArea());
        System.out.println(r1.calculateArea());
	}
        
       

	

}
