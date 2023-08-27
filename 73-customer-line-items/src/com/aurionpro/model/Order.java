package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int orderId;
	private Date date;
	List<LineItem>items = new ArrayList<>();
	private double orderCost;
	public Order(int orderId, Date date, List<LineItem> items) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.items = items;
		this.orderCost = calculateOrderPrice();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	
	public double calculateOrderPrice() {
	   double orderCost = 0;
	   for(LineItem x : items) {
		   orderCost+=x.calculateLineItemCost();
	   }
	   return orderCost;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", date=" + date + ", items=" + items + ", orderCost=" + orderCost
				+ ", getOrderId()=" + getOrderId() + ", getDate()=" + getDate() + ", getItems()=" + getItems()
				+ ", calculateOrderPrice()=" + calculateOrderPrice() + "]";
	}
	
	
	
}
