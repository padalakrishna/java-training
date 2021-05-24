package com.java.threads.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceConditionExample {

	public static void main(String args[]) {

		Orders order = new Orders();

		System.out.println("Starting Executor Service....");
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		// assume each thread like an each user 
		for (int i = 1; i <= 100; i++) {
			executorService.execute(new CounterRunnable(order));
		}

		executorService.shutdown();

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Value of counter is "+order.getOrders().get("laptop"));
				System.out.println("Completed Executing the counter...");
			}
		});
	}

}
