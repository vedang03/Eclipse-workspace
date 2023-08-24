package com.aurionpro.model;

public class PrintChar implements Runnable {

	@Override
	public void run() {
		for(char i='A';i<'K';i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +(char)i);
		}
	}
}
