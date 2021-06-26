package com.src.java.day2ex;

import java.util.Date;
import java.util.Scanner;

public class ElectricityBill {
	
	public String cname,cno,ebtyp;
	public double previous,current,units, billamt;
	Date dt=new Date();
	Scanner sc=new Scanner(System.in);
	
	public void  details()
	{
		System.out.println("Enter the consumer name");
		cname=sc.next();
		System.out.println("Enter the consumer number");
		cno=sc.next();
		System.out.println("Enter the Eb Type");
		ebtyp=sc.next();
		System.out.println("Enter the previous month reading");
		previous=sc.nextDouble();
		System.out.println("Enter the current month reading");
		current=sc.nextDouble();
	}
    public void calculate()
    {
    	units=current-previous;
    	if(ebtyp.equals("domestic"))
    	{
    		if (units<=100)
    		billamt=1 * units;
    		else if (units>100 && units<=200)
    		billamt=2.50*units;
    		else if(units>200 && units<=500)
    		billamt= 4*units;
    		else
    		billamt= 6*units;
    	}
    	else if(ebtyp.equals("commercial"))
    	{
    		if (units<=100)
    		billamt=2 * units;
    		else if (units>100 && units<=200)
    		billamt=4.50*units;
    		else if(units>200 && units<=500)
    		billamt= 6*units;
    		else
    		billamt= 7*units;
    	}
    	else
    	{
    	   System.out.println("wrongly typed/incorrect type"); 
    	}
    		
    }
    public void display()
    {
    	System.out.println("-----------------------ELECTRICITY BILL-----------------");
    	System.out.println("Date: "+dt);
    	System.out.println("\tconsumer number:  "+cno);
    	System.out.println("----------------------------------------------------------");
    	System.out.println("\tconsumer name:    "+cname);
    	System.out.println("\tEB type:          "+ebtyp);
    	System.out.println("\tprevious reading: "+previous);
    	System.out.println("\tcurrent reading:  "+current);
    	System.out.println("\tunits:            "+units);
    	System.out.println("----------------------------------------------------------");
    	System.out.println("\tbill amount:      "+billamt);
    
    }
	public static void main(String[] args) {
	ElectricityBill eb=new ElectricityBill();
	eb.details();
	eb.calculate();
	eb.display();
	}

}
