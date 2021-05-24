package com.java.threads.synchronization;

public class ProcessingThread implements Runnable {

private int count;

private Object myObj = new Object();
    
    @Override
    public void run() {
        for(int i=1; i<5; i++){
            processSomething(i);
            synchronized (myObj) {
            	count++;
			}
        }
    }

    public int getCount() {
        return this.count;
    }
    
    public synchronized void increamentVariable() {
    	count++;
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
