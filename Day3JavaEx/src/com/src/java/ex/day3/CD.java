package com.src.java.ex.day3;

public class CD extends Publication{
	public String ptime;
	
	public CD(String title, float price,String ptime) {
		super(title, price);
		this.ptime=ptime;
		
	}


     public void display()
     {
    	 super.display();
    	 System.out.println("The playing time is: "+ptime);
     }
}
