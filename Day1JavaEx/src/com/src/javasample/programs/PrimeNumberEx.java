package com.src.javasample.programs;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean flag = false;
		if(n==0||n==1)
		{
			System.out.println(n+" is not prime number");
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=true;
					break;
				}
			}
		}
		if(!flag)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println("is not a prime number");
		}
		
	}
}
