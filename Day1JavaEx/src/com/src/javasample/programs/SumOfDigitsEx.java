package com.src.javasample.programs;

import java.util.Scanner;

public class SumOfDigitsEx {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int n=sc.nextInt();
	   int sum=0;
	   System.out.println("Given number:"+n);
	   while(n!=0)
	   {
		   sum+=n%10;
		   n=n/10;
	   }
	   System.out.println("sum of digits:"+sum);
   }
}
