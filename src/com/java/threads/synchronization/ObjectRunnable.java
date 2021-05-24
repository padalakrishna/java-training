package com.java.threads.synchronization;

public class ObjectRunnable implements Runnable {

	private Object obj;
	
	public ObjectRunnable(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		
		synchronized (obj) {
			System.out.println("Thread "+Thread.currentThread().getName()+" going into wait state");
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread "+Thread.currentThread().getName()+" exiting from wait state");
		}
	}
	
	

}
