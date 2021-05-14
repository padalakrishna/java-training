package com.java.multithreading;

import java.util.Iterator;

public class ThreadJoin {
	
	public static void main(String args[] ) throws InterruptedException {
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				
				for(int i=0;i<6;i++) {
					System.out.println("Thread Name: "+Thread.currentThread().getName()+ " loop variable is "+i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				
				for(int i=0;i<6;i++) {
					System.out.println("Thread Name: "+Thread.currentThread().getName()+ " loop variable is "+i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				
				for(int i=0;i<6;i++) {
					System.out.println("Thread Name: "+Thread.currentThread().getName()+ " loop variable is "+i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		
		Thread t1 = new Thread(r1, "T-1");
		Thread t2 = new Thread(r2, "T-2");
		Thread t3 = new Thread(r3, "T-3");
		
		System.out.println("In main Thread");
		
		System.out.println("Starting T1 thread");
		t1.start();
		System.out.println("T1 started successfully");
		
		// Invoking join in Main Thread
		t1.join(4000);
		
		System.out.println("Starting T2 thread");
		t2.start();
		System.out.println("T2 started successfully");
		
		System.out.println("Starting T3 thread");
		t3.start();
		System.out.println("T3 started successfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
