package com.src.java.ex.day3;

import java.util.Scanner;

public class PersonDetails {
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Designation:");
	
	System.out.println("1.Manager");
	System.out.println("2.Employee");
	
	int choice=sc.nextInt();
	switch(choice)
	{	
	case 1: Manager m=new Manager();
	        m.name="xyz";
	        m.age=26;
	        m.pno=12345678;
	        m.address="chetpet";
	        m.salary=30000;
	        m.department="HR";
	        m.specialization="MBA";
	        m.display();
	        m.disp();
	        m.printSalary();
	        break;
	        
	case 2: Employee1 emp=new Employee1();
	        emp.name="abc";
            emp.age=25;
            emp.pno=123488678;
            emp.address="tnagar";
            emp.salary=27000;
            emp.department="ccx";
            emp.specialization="Msc.It";
            emp.display();
            emp.disp();
            emp.printSalary();
            break;
	}
	
 }
}
