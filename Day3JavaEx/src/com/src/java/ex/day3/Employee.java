package com.src.java.ex.day3;

import java.util.Scanner;

public class Employee {

	String empname;
	int empid;
	String address;
	String emailid;
	int pno;
	Scanner sc=new Scanner(System.in);
	public void details()
	{
		System.out.println("Enter the employee id:");
		empid=sc.nextInt();
		System.out.println("Enter the employee name:");
		empname=sc.next();
		System.out.println("Enter the address:");
		address=sc.next();
		System.out.println("Enter the email id:");
		emailid=sc.next();
		System.out.println("Enter the phone Number:");
		pno=sc.nextInt();
	}
	public void displayDetails()
	{
		System.out.println("\t\tEmployee details");
		System.out.println("-----------------------------------------");
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+empname);
		System.out.println("Employee Address: "+address);
		System.out.println("Email Id: "+emailid);
		System.out.println("Employee Phone Number: "+pno);
		System.out.println("-----------------------------------------");
		
	}
}
