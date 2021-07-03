package com.src.java.ex.day11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorManipulation {
	static Scanner sc=new Scanner(System.in);
    
	public static void main (String args[])
	{
		System.out.println("Vector addition, subtraction and mulitplication");
		 Vector<Integer> vi=new Vector<Integer>();
		 
		 vi.add(1);
		 vi.add(2);
		 vi.add(3);
		 vi.add(4);
		 vi.add(5);
		 vi.add(6);
		 vi.add(7);
		 vi.add(8);
		 vi.add(9);
		 
		 System.out.println("Vectors are:"+vi);
	
//		 int a=additionVector(vi);
//		 int b=subVector(vi);
//		 int c=mulVector(vi);
//		 int mul = 0,sum=0,sub=0;
//	
		 System.out.println("sum of vector is: "+additionVector(vi));
		 System.out.println("Subtraction of vecor: "+subVector(vi));
		 System.out.println("Multiplication of vector is: "+mulVector(vi));
		 
	}
	
	private static int mulVector(Vector<Integer> vi) {
		System.out.println("Enter the number for multiplication:");
		int mul=sc.nextInt();
		Iterator<Integer> itr=vi.iterator();
		while(itr.hasNext())
		{
			int n=itr.next();
			int mul1=n*mul;
            System.out.println(mul1);
		}
		return mul;
	}
	private static int subVector(Vector<Integer> vi) {
		System.out.println("Enter the number for subtraction:");
		int sub=sc.nextInt();
		Iterator<Integer> itr=vi.iterator();
		while(itr.hasNext())
		{
			int n=itr.next();
			int sub1=n-sub;
            System.out.println(sub1);
		}
		return sub;
	}
	private static int additionVector(Vector<Integer> vi) {
		System.out.println("Enter the number for addition:");
		int sum=sc.nextInt();
		Iterator<Integer> itr=vi.iterator();
		while(itr.hasNext())
		{
			int n=itr.next();
			int sum1=n+sum;
            System.out.println(sum1);
		}
		return sum;
		}	
}
