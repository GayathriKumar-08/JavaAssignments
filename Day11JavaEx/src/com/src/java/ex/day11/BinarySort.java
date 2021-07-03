package com.src.java.ex.day11;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySort {
 
	public static void main(String args[])
	{
		int i;
		System.out.println("Binary search and Sort example");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr=new int[n];
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Elements in the array are:");
		for (i=0; i<n; i++)   
		{  
		System.out.println(arr[i]);  
		}  
		
		System.out.println("Sorting Array");
		
        Arrays.sort(arr);
        for (i=0; i<n; i++)   
		{  
		System.out.println(arr[i]);  
		}  
  
        System.out.println("Enter the 2 keys for seaching....");
        int num=sc.nextInt();
        int num1=sc.nextInt();
        int key = num;
        int res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " found at index=> "+ res);
        else
            System.out.println(key + " Not found");
  
        key = num1;
        res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " found at index=> "+ res);
        else
            System.out.println(key + " Not found");
	}
}
