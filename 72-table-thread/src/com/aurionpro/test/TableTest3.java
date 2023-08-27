package com.aurionpro.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TableTest3 {

	public static void main(String[] args) {
		Runnable task = ()->{
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		// Manually creates 10 threads using for loop.
//		for(int i=0;i<10;i++) {
//			String name = "Thread: " + i;
//			Thread temp = fef Thread(task,name);
//			temp.start();
//		}
		
	ExecutorService service = Executors.newFixedThreadPool(10);
	for(int i=0;i<10;i++) {
		service.execute(task);
	}

	}

}
