package com.src.java.day7.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileEx1 {
 
	public static void main(String args[])
   {
	try {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter the file name for searching");
	      String fname=br.readLine();
	      FileFind ff=new FileFind();
	      ff.fileFind(fname);
	      ff.getFileExtension(fname);
	  }catch(IOException e)
	  {
		System.out.println("Error:"+e);
	}
	   
   }
}
