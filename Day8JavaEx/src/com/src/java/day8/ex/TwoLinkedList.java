package com.src.java.day8.ex;

import java.util.LinkedList;
import java.util.Scanner;

public class TwoLinkedList {
	public static void main(String args[]) {
	   System.out.println("Adding two LinkedList");
	  
	   LinkedList<Integer> li=new LinkedList<Integer>();
	   
	   LinkedList<Integer> lli=new LinkedList<Integer>();
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of the array:");
	  int size=sc.nextInt();
	  int n;
	  for(int i=0;i< size;i++)
	  {
		  System.out.println("Enter the numbers:");
		  n=sc.nextInt();
		  li.add(n);
	  }
	  System.out.println(li);
	  System.out.println("-------------------");
	  System.out.println("Enter the size");
	  int s=sc.nextInt();
	  for(int i=0;i< s;i++)
	  {
		  System.out.println("Enter the numbers:");
		  int num=sc.nextInt();
		  lli.add(num);
	  }
	  System.out.println(lli);
//	//adding elements
//	   lli.add("101");
//	   lli.add("102");
//	   lli.add("103");
//	   lli.add("104");
//	   System.out.println(lli);
//	   
//      li.add("Arya");
//      li.add("Daisy");
//      li.add("Gayathri");
//	  li.add("Veveliya");
//      System.out.println(li);
//      
//      
      LinkedList<Integer> list=new LinkedList<Integer>();
      list.addAll(li);
      list.addAll(lli);
      System.out.println(list);
}
	
}
