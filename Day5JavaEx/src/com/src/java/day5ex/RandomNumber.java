package com.src.java.day5ex;

import java.util.Random;

public class RandomNumber extends Thread{

	Random rnum=new Random();
   public void run()
   {
	   for(int i=0;i<10;i++)
	   {
		   int random=rnum.nextInt(100);
		   System.out.println("Random numbers: "+random);
		   
		   if(random % 2 ==0)
		   {
			   SquareNumber sn= new SquareNumber(random);
			   sn.start();
		   }
		   else
		   {
			   CubeNumber cn=new CubeNumber(random);
			   cn.start();
		   }
		   try
		   {
			   Thread.sleep(1000);
		   }catch(InterruptedException e)
		   {
			   System.out.println("Error"+e);
		   }
	   }
   }
}
