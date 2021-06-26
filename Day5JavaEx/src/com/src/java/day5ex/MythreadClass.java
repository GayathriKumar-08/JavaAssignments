package com.src.java.day5ex;

public class MythreadClass extends Thread {
	public void run()
	{
		Thread t=Thread.currentThread();
		t.setName("MyThread");
		System.out.println("Current Thread: "+t);
		try
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Error: "+e);
		}
	}
}
