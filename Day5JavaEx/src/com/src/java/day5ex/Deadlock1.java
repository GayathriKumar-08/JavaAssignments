package com.src.java.day5ex;

public class Deadlock1 extends Thread{
	private static final String Lock1 = "ABC";
	private static final String Lock2 = "CBA";

	public void run()
	{
		synchronized (Lock1) {
            System.out.println("Thread 1: Holding lock 1...");
            
            try {
            	Thread.sleep(10);
            	}
            catch (InterruptedException e)
            {
            	System.out.println("Error"+e);
            }
            System.out.println("Thread 1: Waiting for lock 2...");
            
            synchronized (Lock2) {
               System.out.println("Thread 1: Holding lock 1 & 2...");
		}
	 }
	}

}
