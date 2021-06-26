package com.src.java.day5ex;

public class AliveJoinEx {
     public static void main(String args[]) throws InterruptedException
     {
    	 MythreadClass t1=new MythreadClass();
    	 t1.start();
    	
    	 RunnableEx re=new RunnableEx();
    	 Thread t2=new Thread(re);//default thread
    	 t2.start();
     	
    	 if(t1.isAlive())
    		 System.out.println("t1 is running!");
    	 
    	 t1.join();
    	 if(t1.isAlive())
    		 System.out.println("t1 is running!");
    	 else
    		 System.out.println("t1 is terminated!");
    	 if(t2.isAlive())
    		 System.out.println("t2 is running!");
    	 t2.join();
    	 
     }
}
