package com.java.threads.synchronization;

public class InterruptedExample {
	
	public static void main(String args[]) {
		
		Runnable r = () -> {
			
			for(int i=0; i<5;i++) {
				System.out.println("Current Loop Value is:- "+i );
//				if(Thread.interrupted()) {
//					System.out.println("Thread "+Thread.currentThread().getName()+" is interrupted....");
//				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Thread is interrupted....");
				}
			}
		};
		
		Thread t = new Thread(r, "T-1");
		t.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t.interrupt();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Thread "+t.getName()+" isInterrupted:"+t.isInterrupted());
	}

}
