package com.src.java.day5ex;

public class FibonacciEx123 {
	 
	public static void main(String args[]) throws InterruptedException
	{
		FibonacciEx fe=new FibonacciEx();
		
		fe.start();
		
		 if(fe.isAlive())
    		 System.out.println("Fibo thread is running!");
    	 
    	 fe.join();
    	 if(fe.isAlive())
    		 System.out.println("Fibo thread is running!");
    	 else
    		 System.out.println("Fibo thread is terminated!");
	}

}
