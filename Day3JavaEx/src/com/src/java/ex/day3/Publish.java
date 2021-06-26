package com.src.java.ex.day3;

public class Publish {
	
	public static void main(String args[])
	{
		
	   Publication pb=new Book("Gifts of Grace",110,500);	
	   pb.display();
	   System.out.println("------------------------------------------");
	   Publication pc=new CD("Need For Speed",650,"3hrs");
	   pc.display();
	}
}
