package com.src.java.day2ex;

import java.util.Scanner;

public class Number {
	public static double n;
	Scanner sc=new Scanner(System.in);
	public Number()
	{
		System.out.println("Enter the value ");
		n=sc.nextDouble();
	}
	public Number(double n)
	{
		this.n=n;
	}
	public boolean isZero()
	{
		if(n==0)
			return true;
		else
			return false;
	}
	public boolean isPositive()
	{
		if(n > 0)
			return true;
		else
			return false;
	}
	public boolean isNegative()
	{
		if(n < 0)
			return true;
		else 
			return false;
	}
	public boolean isOdd()
	{
		if(n%2 != 0)
		return true;
		else 
			return false;
	}
	public boolean isEven()
	{
		if(n%2 == 0)
			return true;
		else 
			return false;
	}
	public boolean  isAmstrong()
	{
		double originalNumber, remainder, result = 0;
		 originalNumber = n;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }
	        if(result==n)
	        	return true;
	        else
	      return false;

	}
	public double getFactorial(double n) {
		if (n == 0)
	          return 1;
	          
	        return n*getFactorial(n-1);
	}
	public boolean getSqrt() {
		double sqrt=Math.sqrt(n);   
		return ((sqrt - Math.floor(sqrt)) == 0);   
	}
	public boolean getSum()
	{
		if(n+n!=0)
		   return true;
		else 
			return false;
	}

   public double getReverse( )
   {
	   double reverse=0;
		System.out.println("Number entered is: "+n);
		  do
		     {
		     reverse=reverse*10+n%10;
		     n=n/10;
		     }while(n>0);
    	return reverse;
   }
   public void dispBinary ( )
   {
   long lg=500;
System.out.println("ByteValue of lg :" + Long.toBinaryString(lg));
   }
	public static void main(String args[])
	{
		Number num=new Number();
		System.out.println("isZero: "+num.isZero());
		System.out.println("isPositive: "+num.isPositive());
		System.out.println("isNegative: "+num.isNegative()); 
		System.out.println("isOdd: "+num.isOdd());
		System.out.println("isEven: "+num.isEven());
		System.out.println("isArmstrong: "+num.isAmstrong());
		System.out.println("getFactorial: "+num.getFactorial(n));
		System.out.println("getSqrt: "+num.getSqrt());
		System.out.println("getSum: "+num.getSum());
		System.out.println ("getReverse: "+ num.getReverse( ));
		num.dispBinary();
	
	}

}
