package com.src.java.ex.day3;

public class Book extends Publication{
	public int pageno;
	public Book(String title, float price,int pageno) {
		super(title, price);
		this.pageno=pageno;
	}

	public void display()
	{
		super.display();
		System.out.println("The no of pages is: "+pageno);
	}

}
