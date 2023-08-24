package com.aurionpro.model;

public class Table extends Thread {
	private int number;

	public Table(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i * number);
		}
	}

}
