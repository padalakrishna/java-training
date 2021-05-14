package com.java.multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<6;i++) {
			System.out.println("Thread name is "+Thread.currentThread().getName()+ " loop is "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	
	

}
