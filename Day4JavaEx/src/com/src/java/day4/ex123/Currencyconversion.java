package com.src.java.day4.ex123;

import java.util.Scanner;

public class Currencyconversion {
   
	double inr;
	double euro;
	double usd;
	double yen;
	
	Scanner sc=new Scanner(System.in);
	
	public void dollTorup()
	{
		System.out.println("Enter the usd for converting:");
	    usd=sc.nextDouble();
	    inr= usd * 67;
	    System.out.println("Dollar: "+usd+" INR: "+inr);
	}
	public void inrTousd()
	{
		System.out.println("Enter the inr for converting:");
	    inr=sc.nextDouble();
	    usd= inr/67;
	    System.out.println("INR: "+inr+" Dollar: "+inr);
	}
	
	public void euroToinr()
	{
		System.out.println("Enter the euro for converting:");
	    euro=sc.nextDouble();
	    inr= euro * 79.50;
	    System.out.println("Euro: "+euro+" INR: "+inr);
	}
	public void inrToeuro()
	{
		System.out.println("Enter the inr for converting:");
	    inr=sc.nextDouble();
	    usd= inr/79.50;
	    System.out.println("INR: "+inr+" Euro: "+euro);
	}
	public void yenToinr()
	{
		System.out.println("Enter the yen for converting:");
	    yen=sc.nextDouble();
	    inr= yen * 0.61;
	    System.out.println("Yen: "+yen+" INR: "+inr);
	}
	public void inrToyen()
	{
		System.out.println("Enter the inr for converting:");
	    inr=sc.nextDouble();
	    usd= inr/0.61;
	    System.out.println("INR: "+inr+" Yen: "+yen);
	}
	
}
