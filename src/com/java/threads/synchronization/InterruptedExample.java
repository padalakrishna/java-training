package com.java.threads.synchronization;

public class InterruptedExample {

	public static void main(String args[]) {

		Runnable r = () -> {
			try {
				for (int i = 0; i < 5; i++) {
					System.out.println("Current Loop Value is:- " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("Thread is interrupted....");
			}
		};

		Thread t = new Thread(r, "T-1");
		t.start();
		t.interrupt();
		System.out.println("Thread "+t.getName()+ "isInterrupted:"+t.isInterrupted());
	}

}
