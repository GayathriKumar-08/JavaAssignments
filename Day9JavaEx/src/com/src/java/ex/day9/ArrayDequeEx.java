package com.src.java.ex.day9;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeEx {
	public static void main(String args[])
	{
		System.out.println("Array Deque");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n=sc.nextInt();
		
		ArrayDeque<String> ad=new ArrayDeque<String>();
	
		for(int i=0;i< n;i++)
		  {
			  System.out.println("Enter the elements into list:");
			  String str=sc.next();
			  ad.add(str);
		  }
		System.out.println("Elements in array deque:"+ad);
		 System.out.println("-------------------------------------");
		System.out.println("First Element:"+ad.getFirst());
		 System.out.println("Last Element:"+ad.getLast());
		
//		 
//		 for (String element : ad)
//	        {
//	            System.out.println("Element : " + element);
//	        }
		 System.out.println("-------------------------------------");
		System.out.println("peeking element:"+ad.peek());
		System.out.println(ad);
		 System.out.println("-------------------------------------");
		 
		System.out.println("poll element:"+ad.poll());
		System.out.println(ad);
		 System.out.println("-------------------------------------");
		 
		System.out.println("remove element:"+ad.remove());
		System.out.println(ad);
		 System.out.println("-------------------------------------");
		 
		System.out.println("Poping out an element:"+ad.pop());
		System.out.println(ad);
		 
	}

}
