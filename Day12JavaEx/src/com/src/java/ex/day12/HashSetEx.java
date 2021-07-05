package com.src.java.ex.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx {
	Scanner sc=new Scanner(System.in);
	private void myownClassMethod(HashSet<MyownClass> mc, String name, int age) {
		System.out.println("Enter the details");
		System.out.println("=============================");
	    System.out.println("Enter the size....");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++) {
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the age");
		age=sc.nextInt();
		
		mc.add(new MyownClass(name,age));
	    }
		Iterator<MyownClass> itr=mc.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Details are: "+itr.next());
		}
		
		System.out.println(mc);
		System.out.println("size: "+mc.size());
	}	
	//////////////////////////////////////////////////////////////////////
	private void stringObjectUse(HashSet<String> mc1) {

		System.out.println("===========================");
		System.out.println("Enter the size:");
		   int n=sc.nextInt();
		    for(int i=0;i<n;i++) {
		    	System.out.println("Enter the String");
		    	String str=sc.next();
		        mc1.add(str);
		    }
		    
		    Iterator<String> itr=mc1.iterator();
			
			while(itr.hasNext())
			{
				System.out.println("Strings are: "+itr.next());
			}
			System.out.println("Enter the string to be removed");
			String str1=sc.next();
			mc1.remove(str1);
			System.out.println(mc1);
			System.out.println("size: "+mc1.size());
	}
	/////////////////////////////////////////////////////////
	private void integerObjectUse(HashSet<Integer> mc2) {
		
		System.out.println("===========================");
		System.out.println("Enter the size:");
		   int n=sc.nextInt();
		    for(int i=0;i<n;i++) {
		    	System.out.println("Enter the Integers");
		    	int num=sc.nextInt();
		        mc2.add(num);
		    }
		    
		    Iterator<Integer> itr=mc2.iterator();
			
			while(itr.hasNext())
			{
				System.out.println("Integers are: "+itr.next());
			}
	
			System.out.println("size: "+mc2.size());
			
	}
	
	public static void main(String args[])
	{		
		 String name = " ";
		 int age = 0;
		
		HashSet<MyownClass> mc=new HashSet<MyownClass>();
		HashSet<String> mc1=new HashSet<String>();
		HashSet<Integer> mc2=new HashSet<Integer>();

		
		HashSetEx hs=new HashSetEx();
		
		hs.myownClassMethod(mc,name,age);
		hs.stringObjectUse(mc1);
		hs.integerObjectUse(mc2);
	}
	



}
