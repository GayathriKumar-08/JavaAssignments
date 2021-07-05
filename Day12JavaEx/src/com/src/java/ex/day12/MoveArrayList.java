package com.src.java.ex.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//{3, 8, 92, 4, 2, 17, 9}
public class MoveArrayList {
	public static void main (String args[])
	{
		int n,num;
	System.out.println("Removing event length elements");
	Scanner sc=new Scanner(System.in);
	
    System.out.println("Enter the size...");
     n=sc.nextInt();
    System.out.println("Enter the Numbers into the arraylist");
    System.out.println("----------------------------------------");
    
    ArrayList<Integer> arr=new ArrayList<Integer>();
    
    for(int i=0;i<n;i++)
    {
    	System.out.println("Enter the number");
    	num=sc.nextInt();
    	arr.add(num);
    }
    System.out.println("Elements in arraylist is: "+arr);
    int min = arr.get(0);
    
       for(int i=0;i<arr.size();i++)
       {
    	   if (arr.get(i) < min) {
               min = arr.get(i);
           }
       }
       System.out.println("Minimum value in the arraylist is : " + min);  
       int ind=min;
       int indexno=arr.indexOf(ind);
       arr.remove(indexno);
       System.out.println("Elements in arraylist are: "+arr);
       arr.add(0,ind);
       System.out.println("Final arraylist: "+arr);
	}
}
