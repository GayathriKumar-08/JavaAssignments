package com.src.java.ex.day13;

import java.util.Scanner;

public class SubStringClass {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		SubStringClass s=new SubStringClass();
		s.subStringMethod(str,str.length());
	
	}

	private void subStringMethod(String str, int n) {
	
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				System.out.println("{"+str.substring(i, j)+"}");
			}
		}
		
	}


}
