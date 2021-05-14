package com.java.multithreading;

public class DaemonThreadExample {
	
	
	public static void main(String args[]) {
		
		MyRunnable r = new MyRunnable();
		
		Runnable deamonRunnable = () -> {
			
			for(int i=0; i<6;i++) {
				System.out.println("Deamon Thread :"+ Thread.currentThread().getName()+ " loop value is "+i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Thread userThread = new Thread(r, "T-1"); // user Thread
		Thread deamonThread = new Thread(deamonRunnable, "DeamonThread");
		
		// setting thread to Deamon
		deamonThread.setDaemon(true);
		
		
		// Starting the 2 thread
		userThread.start();
		deamonThread.start();
		
		
		
	
		
		
	}

}
