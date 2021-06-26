package com.src.java.day5ex;

public class Deadlock2 extends Thread {
	private static final String Lock1 = "ABC";
	private static final String Lock2 = "CBA";

	public void run()
	{
		synchronized (Lock2) {
            System.out.println("Thread 2: Holding lock 2...");
            
            try {
            	Thread.sleep(10);
            }
            catch (InterruptedException e) {
            	System.out.println("Error"+e);
            }
            System.out.println("Thread 2: Waiting for lock 1...");
            
            synchronized (Lock1) {
               System.out.println("Thread 2: Holding lock 1 & 2...");
            }
         }
	}
}
