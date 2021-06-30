package com.src.java.day8.ex;

import java.util.LinkedList;
import java.util.Scanner;

public class CheckElements {
	public static void main(String args[])
	{
		System.out.println("Checking Element in LinkedList");
		LinkedList<String> li=new LinkedList<String>();
		LinkedList<Integer> lli=new LinkedList<Integer>();
		
		//adding elements
		li.add("elephant");
		li.add("dog");
		li.add("cat");
		li.add("lion");
		System.out.println(li);
		
		lli.add(2);
		lli.add(4);
		lli.add(6);
		lli.add(8);
		System.out.println(lli);
		
	
			System.out.println("Check: "+li.contains("cat"));
			
			System.out.println("Check: "+li.contains("tiger"));
	
			System.out.println("check: "+lli.contains(4));
			
			System.out.println("check: "+lli.contains(10));
		
		
	}
}
