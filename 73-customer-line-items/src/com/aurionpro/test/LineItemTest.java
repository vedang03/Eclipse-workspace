package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class LineItemTest {

	public static void main(String[] args) {
	Product p1 = new Product(2324,"Shampoo",100,10);
	Product p2 = new Product(2335, "Noodles", 60, 15);
	
	
	LineItem l1 = new LineItem(1,2,p1);
	LineItem l2 = new LineItem(2, 5, p2);
//	System.out.println(l1.calculateLineItemCost());
	
	List<LineItem> list1 = new ArrayList<>();
	list1.add(l1);
	list1.add(l2);
	Order o1 = new Order(1, new Date(),list1);
//	System.out.println(o1.calculateOrderPrice());
	
	List<Order>listOrder1 = new ArrayList<>();
	listOrder1.add(o1);
	
	Customer c1 = new Customer(1,"Vedang",listOrder1);
	for(Order x : c1.getOrders()) {
		System.out.println(x);	
	}
	
		

	}

}
