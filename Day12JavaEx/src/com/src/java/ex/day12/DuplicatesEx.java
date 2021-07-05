package com.src.java.ex.day12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class DuplicatesEx {
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size...");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the integer:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Printing elements in the array....");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" Array is : " + (Arrays.toString(arr)));
        TreeSet<Integer> ts = new TreeSet<Integer>();
        
        for(int number:arr) {
        	if(!ts.add(number))
        	{
        		System.out.println("Duplicate element in the set is: " + number);
        	}
        }
        System.out.println("Elements in the tree set are: "+ts);
	}

}
