package com.src.java.day7.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LowerClass {
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the source file....");
	  String fn=sc.nextLine();
	  System.out.println("Enter the destination file....");
	  String fn1=sc.nextLine();
	  
	  try {
          BufferedReader br = new BufferedReader(new FileReader(fn));
          PrintWriter out = (new PrintWriter(new FileWriter(fn1)));
         String fr;
       
         while(( fr= br.readLine()) != null) 
         {
            out.write(fr.toLowerCase()+"\n");
            
          }
         System.out.println("copied...........");
        out.close();
        }

          catch(Exception e)
          {
           e.printStackTrace();
           
          }
  }
}
