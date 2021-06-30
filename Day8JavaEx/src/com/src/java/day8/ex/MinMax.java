package com.src.java.day8.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMax {

	 public static void main(String args[])
	 {
		 System.out.println("ArrayList example....");
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size of the array:");
		  int size=sc.nextInt();
		  int n;
		  for(int i=0;i<size;i++)
		  {
			  System.out.println("Enter the numbers:");
			  n=sc.nextInt();
		     arr.add(n);
		 }
		System.out.println(arr);
		 for(int i=0;i<arr.size();i++)
		 {
			 System.out.println(arr.get(i));
		 }
//		 System.out.println( "ArrayList Min Value: " + Collections.min(arr) );
//		 System.out.println( "ArrayList Max Value: " + Collections.max(arr) );
		int min=arr.get(0);
		int max=arr.get(0);
		
		//System.out.println("For minimum value:");
		 for(int i=0;i<arr.size();i++)
		 {
			 if(arr.get(i)<min)
			 {
				 min = arr.get(i);
			 }
		 }
		// System.out.println("For maximum value:");
		 for (int i = 1; i < arr.size(); i++) {
	            if (arr.get(i) > max) {
	                max = arr.get(i);
	            }
	        }
		 System.out.println("Minimum value:"+min);
		 System.out.println("Maximum value:"+max);
	 }
}
