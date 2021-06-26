package com.src.java.ex.day3;

public class Publication {

	String title;
	float price;
	
	public Publication(String title,float price)
	{
		this.title=title;
		this.price=price;
	}
	public void display()
	{
		System.out.println("The title is: "+title);
		System.out.println("The Price is: "+ price);
	}
}
