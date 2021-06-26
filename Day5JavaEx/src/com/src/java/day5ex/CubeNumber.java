package com.src.java.day5ex;

public class CubeNumber extends Thread {
	int number;
	
	CubeNumber(int number)
	{
		this.number=number;
	}
	public void run()
	{
		
		System.out.println("cube of number: "+number*number);
	}
}
