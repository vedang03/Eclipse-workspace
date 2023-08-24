package com.aurionpro.test;

import com.aurionpro.model.PrintChar;

public class ThreadTest2 {
     public static void main(String[] args) {
//		PrintChar printObj = new PrintChar();
//		Thread t1 = new Thread(printObj);
//		t1.start();
    	 
    	Runnable obj = new Runnable() {
    		
			
			@Override
			public void run() {
				for(int i='A';i<'D';i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println((char)i);
				}
			}
		   
		};
	
		};
	}

