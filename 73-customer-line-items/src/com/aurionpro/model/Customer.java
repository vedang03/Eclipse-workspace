package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerId;
	private String customerName;
	List<Order>orders = new ArrayList<>();
	public Customer(int customerId, String customerName, List<Order> orders) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.orders = orders;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", orders=" + orders
				+ ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName() + ", getOrders()="
				+ getOrders() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
