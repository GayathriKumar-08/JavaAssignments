package com.src.java.day7.ex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Scanner;

public class CreateFile {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name that you want to create!!!!");
		String fname=sc.next();
		fname = fname + ".txt";
		
		File f1=new File(fname);
		
		try {
		if(f1.createNewFile())
		{
			System.out.println(" New File is create");
		}
		else
		{
			System.out.println("File already exists");

			FileWriter myWriter = new FileWriter(f1);
			
			myWriter.write("FILE IS Created.This File Is My First File, Date And time is:"+new Date());
			myWriter.close();		
			System.out.println("New file has been created");
		}
		}catch(IOException e)
		{
			System.out.println("Error"+e);
		}
		
	}
}
