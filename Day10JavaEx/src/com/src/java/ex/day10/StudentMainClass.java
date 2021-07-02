package com.src.java.ex.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMainClass {
  public static void main(String args[])
  {
	     int rollno=0;
	    String name="";
	    String address="";
	    
	  ArrayList<Student> arr = new ArrayList<Student>();
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the size");
	  int size=sc.nextInt();
	  
	  for(int i=0;i<size;i++)
	  {
		  System.out.println("Enter student details");
		  System.out.println("-----------------------------");
		  System.out.println("Enter the student roll no:");
		   rollno=sc.nextInt();
		  System.out.println("Enter the student name:");
		  name=sc.next();
		  System.out.println("Enter the address:");
		  address=sc.next();
		  
		  arr.add(new Student(rollno,name,address));
	  }

      System.out.println("Unsorted list");
      for (int i = 0; i < arr.size(); i++)
          System.out.println(arr.get(i));

      
      Collections.sort(arr, new SortRoll());

      System.out.println("\nSorted list using rollno");
      for (int i = 0; i < arr.size(); i++)
          System.out.println(arr.get(i));

      Collections.sort(arr, new SortName());

      System.out.println("\nSorted list using name");
      for (int i = 0; i < arr.size(); i++)
          System.out.println(arr.get(i));
  }
 
}
