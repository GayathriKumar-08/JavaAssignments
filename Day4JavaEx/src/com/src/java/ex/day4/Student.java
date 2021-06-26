package com.src.java.ex.day4;
import java.util.Scanner;

public class Student {
     int rollno;
     String name;
     float mark;
   
     Student(int rollno,String name, float mark)
     {
    	 this.rollno=rollno;
    	 this.name=name;
    	 this.mark=mark;
     }

     public void display()
     {
    	 System.out.println("Details of students");
    	 System.out.println("---------------------------------------");
    	 System.out.println("Roll no: "+rollno);
    	 System.out.println("Name: "+name);
    	 try {
    	 if(mark > 500)
    	 	 throw new MarkOBException(mark);
    	     System.out.println("Mark: "+mark);
    	 }catch(MarkOBException e)
    	 {
    		 System.out.println("Error: "+e);
    	 }
     }
}
