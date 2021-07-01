package com.src.java.ex.day9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIteratorEx {
	
	private void listiteratorMethod(ArrayList<String> arr) {
		 
		 System.out.println("Using ListIterator:");
		 ListIterator<String> iterator = arr.listIterator();
		 while(iterator.hasNext())
		 {
			 System.out.println("Elements are:"+iterator.next());
		 }
		// iterator.remove();
		 System.out.println("After the remove() method is called : "+arr); 	
		 
		 while(iterator.hasPrevious())
		 {
			 Object element=iterator.previous();
			 System.out.println(element + "");
		 }
		 iterator.remove();
		 System.out.println("After the remove() method is called : "+arr); 	
	}

	private void iteratorMethod(ArrayList<String> arr) {
		System.out.println("Using Iterator:");
		
		Iterator<String> itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println("Elements are:"+itr.next());
		}

		 System.out.println("After the remove() method is called : "+arr); 
		 System.out.println("------------------------------------------------------");
	}
	
   public static void main(String args[])
   {
	   System.out.println("Array List");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n=sc.nextInt();
		ArrayList<String> arr=new ArrayList<String>();
		
		for(int i=0;i< n;i++)
		  {
			  System.out.println("Enter the elements into list:");
			  String str=sc.next();
			  arr.add(str);
		  }
		
		ListIteratorEx lst=new ListIteratorEx();
		lst.iteratorMethod(arr);
		lst.listiteratorMethod(arr);
	
   }


}
