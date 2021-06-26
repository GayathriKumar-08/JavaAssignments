package com.src.java.day4.ex4;

import java.util.Scanner;

import com.src.java.ex.day4.Student;

public class Employee123 {
	public static void main(String args[])
	{
	    int empno=0;
	    String empname="";
	    int bpay=0; 
	    Scanner sc=new Scanner(System.in);
	    
		 System.out.println("Enter Employee details:");
    	 System.out.println("---------------------------------------");
    	 System.out.println("Enter the employee number:");
    	 empno=sc.nextInt();
    	 System.out.println("Enter the  employee name:");
    	 empname=sc.next();
    	 System.out.println("Enter the basic pay:");
    	 bpay=sc.nextInt();
    	 
		Employee emp=new Employee(empno,empname,bpay);
		emp.display();
	}

}
