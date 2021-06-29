package com.src.java.day7.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the source file...");
		String str=sc.next();
		System.out.println("Enter the destination file...");
		String str1=sc.next();
	   try {
		FileInputStream fis = new FileInputStream(str);
	    FileOutputStream fos = new FileOutputStream(str1);
	    
	    int c;  
	    while ((c = fis.read()) >0) {  
	     fos.write(c);
	    }
	    System.out.println("Copied to the destination file");
	   }catch(IOException e)
	    {
	    	System.out.println("Error"+e);
	    }
	    
	}

}
