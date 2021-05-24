package com.java.multithreading;

public class ShutDownHookExample {

	public static void main(String args[]) {

		Runnable r = () -> {

			for (int i = 0; i < 5; i++) {

				System.out.println("Loop Count is " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Runnable r2 = () -> {

			for (int i = 0; i < 5; i++) {

				System.out.println("Loop Count is " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(r, "T-1");
		Thread t2 = new Thread(r2, "T-2");
		t.start();
		t2.start();

		Runnable shutDown = () -> {

			System.out.println("JVM is shutting down....");
		};

		// Registering thread with JVM to invoke them during the JVM shutdown.
		Runtime.getRuntime().addShutdownHook(new Thread(shutDown, "ShutDownHookThread"));
	}

}
