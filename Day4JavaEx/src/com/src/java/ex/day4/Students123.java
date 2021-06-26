package com.src.java.ex.day4;

import java.util.Scanner;

public class Students123 {

	public static void main(String args[])
	{
	    int rollno=0;
	    String name="";
	    float mark=0; 
	    Scanner sc=new Scanner(System.in);
	    
		 System.out.println("Enter student details:");
    	 System.out.println("---------------------------------------");
    	 System.out.println("Enter the student roll number:");
    	 rollno=sc.nextInt();
    	 System.out.println("Enter the  student name:");
    	 name=sc.next();
    	 System.out.println("Enter the total marks obtained in 10th std:");
    	 mark=sc.nextFloat();
    	 
		Student stud=new Student(rollno,name,mark);
		stud.display();
	}
}
