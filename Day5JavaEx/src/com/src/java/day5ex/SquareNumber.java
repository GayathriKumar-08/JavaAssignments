package com.src.java.day5ex;


public class SquareNumber extends Thread{
	int number;
	
	SquareNumber(int number)
	{
		this.number=number;
	}
	public void run()
	{
		System.out.println("square is: "+number*number);
	}
}
