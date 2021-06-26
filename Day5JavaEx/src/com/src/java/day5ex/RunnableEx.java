package com.src.java.day5ex;

public class RunnableEx implements Runnable {
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Runnable class");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
