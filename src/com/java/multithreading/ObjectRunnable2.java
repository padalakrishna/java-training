package com.java.multithreading;

public class ObjectRunnable2 implements Runnable {

	private Object obj;
	
	public ObjectRunnable2(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		
		synchronized (obj) {
			System.out.println("Thread "+Thread.currentThread().getName()+" invoking the other thread");
			//obj.notify();
			System.out.println("Thread "+Thread.currentThread().getName()+" exiting...");
		}
	}

}
