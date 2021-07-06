package com.src.java.ex.day13;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeExample {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.next();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
			System.out.print(",");
		}
		for(int i=0;i<n;i++)
		{
		   StringBuffer sb = new StringBuffer(arr[i].toLowerCase());
	       String str = sb.reverse().toString();
	       if(arr[i].equals(str))
	       {
	          System.out.println(str + " is palindrome.");
	        }
	       else
	       {
	         System.out.println(str + " is not palindrome.");
	       }
		}
	}
}
