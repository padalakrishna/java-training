package com.java.multithreading;

import com.java.threads.synchronization.ObjectRunnable;

public class WaitNotifyExample {
	
	public static void main(String args[]) {
		
		Object obj = new Object();
		ObjectRunnable r1 = new ObjectRunnable(obj);
		ObjectRunnable2 r2 = new ObjectRunnable2(obj);
		
		Thread t1 = new Thread(r1, "T-1");
		Thread t2 = new Thread(r2, "T-2");
		
		t1.start();
		t2.start();
		
	}

}
