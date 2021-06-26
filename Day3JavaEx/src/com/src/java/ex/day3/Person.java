package com.src.java.ex.day3;

public class Person {
   String name;
   int age;
   int pno;
   String address;
   double salary;
   
 
   public void display()
   {
	   System.out.println("Employee details");
		System.out.println("-----------------------------------------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number"+pno);
		System.out.println("Address: "+address);
   }
   public void printSalary()
   {
	   System.out.println("You salary is: "+salary);
   }
}
