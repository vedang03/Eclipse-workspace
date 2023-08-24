package com.aurionpro.test;

import com.aurionpro.model.Table;

public class TableTest {

	public static void main(String[] args) {
		Table tableObj1 = new Table(5);
		Thread t1 = new Thread(tableObj1);
		t1.start();
		
		Table tableObj2 = new Table(10);
		Thread t2 = new Thread(tableObj2);
		t2.start();
	}

}
