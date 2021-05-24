package com.java.threads.synchronization;

import java.util.HashMap;
import java.util.Map;

public class Orders {

	private Map<String, Integer> orders = new HashMap<String, Integer>();

	public Orders() {
		orders.put("laptop", 0); 
	}

	public void updateOrders() {
		
		synchronized (orders) {  // Only one thread can access this block at a time 
			Integer count = orders.get("laptop");  // Line 17,18,19 - Critical Section 
			count = count + 1;
			orders.put("laptop", count);
		}

		// Making the thread sleep here to pretend doing some operation
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Map<String, Integer> getOrders() {
		return orders;
	}
}
