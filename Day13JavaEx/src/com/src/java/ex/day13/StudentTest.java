package com.src.java.ex.day13;

import java.util.Scanner;

public class StudentTest {
	 public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
			
		 int rollno = 0;
		 String name = " ";
		 int age = 0;
		 int i;
	
    	   StudentClass stud=new StudentClass(1234,"xyz",22);
    	   StudentClass stud1=new StudentClass(1235,"abc",22);
    	   StudentClass stud2=new StudentClass(1236,"bca",22);
    	   StudentClass stud3=new StudentClass(1238,"zyz",22);
    	   StudentClass stud4=new StudentClass(1239,"sgs",22);
			
    	    stud.display();
			stud1.display();
			stud2.display();
			stud3.display();
			stud4.display();
	       
			  System.out.println("----------------------------------");
		       
		      StudentClass stud5=new StudentClass();
		        
			   System.out.println("Hashcode for student class is: "+stud5.hashCode());
			   System.out.println(stud5.getClass());
			   
			 System.out.println("----------------------------------");
		       
	       System.out.println("object example");
		    Object ob = new Integer(12345);
	        Class c = ob.getClass();
	        System.out.println(c.getName());
	        
	       
	        Object ob1 = new String("This is string");
	        Class c1 = ob1.getClass();
	        System.out.println(c1.getName());
	    	     
	        System.out.println("----------------------------------");
			 boolean bool1=c1.isInstance(ob1);
			System.out.println(bool1);
	 }
}
