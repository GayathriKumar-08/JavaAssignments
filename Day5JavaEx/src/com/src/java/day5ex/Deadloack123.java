package com.src.java.day5ex;

public class Deadloack123 {

	   public static void main(String args[]) {
		   Deadlock1 dc1=new Deadlock1();
		   Deadlock2 dc2=new Deadlock2();
		   dc1.start();
		   dc2.start();
	   }

}
