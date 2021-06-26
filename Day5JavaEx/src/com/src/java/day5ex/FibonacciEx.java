package com.src.java.day5ex;

public class FibonacciEx extends Thread {
	
	int n1=0,n2=1,n3,i,count=10;  
	
     public void run()
     {
    	 System.out.print(n1+" "+n2);
    	 Thread t=Thread.currentThread();
    	 t.setName("Fibonacci Thread");
    	 System.out.println("Current Thread: "+t);
    	 System.out.println("Fibonacci series!!!! ");
    	 try
    	 {
    		 for(i=2;i<count;++i)  
    		 {    
    		  n3=n1+n2;    
    		  System.out.println(" "+n3);    
    		  n1=n2;    
    		  n2=n3;    
    		 }    
    	 }catch(Exception e)
    	 {
    		 System.out.println("Error: "+e);
    	 }
     }
}
