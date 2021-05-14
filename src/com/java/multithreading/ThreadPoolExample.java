package com.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	
	
	public static void main(String args[]) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		// Creating Runnable Objects
		for(int i=0; i<10; i++) {
			executorService.execute(new MyRunnable());
		}
		
		executorService.shutdown();
	}

}
