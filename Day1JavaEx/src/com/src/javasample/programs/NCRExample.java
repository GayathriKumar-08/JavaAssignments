package com.src.javasample.programs;

import java.util.Scanner;

public class NCRExample {
	double factorial(double n)
	{	    	     	      
	  if (n == 0)    
   	     return 1;    
  	  else    
    	  return(n * factorial(n-1));    
	}
	public static void main (String args[])
	{
		NCRExample a=new NCRExample();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
	               int n=sc.nextInt();
		System.out.println("Enter value of r");
	               int r=sc.nextInt();
	               
	           	if(n>=r)
	        	{
	        	double com=a.factorial(n)/(a.factorial(n-r)*a.factorial(r));
	        	double per=a.factorial(n)/a.factorial(n-r);	
	        	System.out.println("The value of "+n+"p"+r+" is : "+per);	
	        	System.out.println("The value of "+n+"c"+r+" is : "+com);
	        	}
	           	else {
	        		System.out.println("Please enter n>=r");
	        	
	        	}	
	}
	

}
