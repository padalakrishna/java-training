package com.java.threads.synchronization;

public class CounterRunnable implements Runnable {

	public Integer counter = null;
	Orders orders = null;
	
	public CounterRunnable(Orders order) {
		this.orders = order;
	}
	
	@Override
	public void run() {
		orders.updateOrders();
	}
}
