package com.src.java.ex.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EvenArrayList {

	public static void main (String args[])
	{
		int n;
		String str;
		System.out.println("Removing event length elements");
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size...");
         n=sc.nextInt();
        System.out.println("Enter the cities name");
        
        ArrayList<String> arr=new ArrayList<String>();
        
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter city in the index:"+i);
        	str=sc.next();
        	arr.add(str);
        }
        System.out.println(arr);
		
        Iterator<String> itr=arr.iterator();
        
        while(itr.hasNext())
        {
        	 String cities=itr.next();
        	
            if( cities.length() % 2 == 0 ) {
                    System.out.println("This is even indexed city: " + cities);
                    itr.remove();
                }
            }
            System.out.println("Final elements in the array is: "+arr);
        }
       
}