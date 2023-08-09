package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {

		List<LineItem>lineItems = new ArrayList<LineItem>();
		
		lineItems.add(new LineItem(1,"Batteries",2,10));
		lineItems.add(new LineItem(2,"Shampoo",1,100));
		lineItems.add(new LineItem(3,"Cadbury",3,30));
		
		System.out.println(LineItem.totalCostOfCart(lineItems)+ " "+"Total cost of cart");
		
	}

}
