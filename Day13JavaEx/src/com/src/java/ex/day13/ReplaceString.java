package com.src.java.ex.day13;

import java.util.Scanner;

public class ReplaceString {

	private void replaceStringMethod(String str, String str1, String str2) {
		
		System.out.println("Original String: "+str);
		String repstr=str.replace(str1,str2);
		System.out.println(repstr);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		System.out.println("Enter the string that you are searching for:");
		String str1=sc.nextLine();
		
		System.out.println("Enter the string that you want to replace:");
		String str2=sc.nextLine();
		
		ReplaceString rs=new ReplaceString();
		rs.replaceStringMethod(str,str1,str2);
	}

}
