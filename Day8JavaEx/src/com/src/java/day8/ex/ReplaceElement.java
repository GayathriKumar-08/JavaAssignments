package com.src.java.day8.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceElement {
	public static void main(String args[])
	{
		System.out.println("Replace Element in ArrayList");
		System.out.println("----------------------------");
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		//adding elements
		al.add("apple");
		al.add("mango");
		al.add("watermelon");
		al.add("kiwi");
		al.add("orange");
		al.add("grapes");
		
		System.out.println(al);
		System.out.println("---------------------------------------");
		System.out.println("change mango to banana");

		al.set(1,"banana");//mango to banana
		System.out.println(al);
		
		System.out.println("---------------------------------------");
		System.out.println("change grapes to orange");
		al.set(5,"orange");//grapes to orange
		System.out.println(al);
		
		System.out.println("---------------------------------------");
		al.remove(2);//removes water melon
		System.out.println("change orange to grapes");	
		al.set(4,"grapes");
		System.out.println(al);
	}

}
