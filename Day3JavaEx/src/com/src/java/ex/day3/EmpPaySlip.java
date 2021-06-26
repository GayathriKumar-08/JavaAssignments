package com.src.java.ex.day3;

import java.util.Scanner;

public class EmpPaySlip {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter your designation:");
    	 System.out.println("1.Programmer");
    	 System.out.println("2.Assistant Professor");
    	 System.out.println("3.Associate Professor");
    	 System.out.println("4.Professor");
    	 System.out.println("----------------------------");
    	 
    	 int choice=sc.nextInt();
    	 switch(choice)
    	 {
    	 case 1:Programmer pg=new Programmer();
    	        pg.details();
    	        pg.displayDetails();
    	        pg.calculatePay();
    	         break;
    	 case 2: AssistantProfessor ap=new AssistantProfessor();
    	         ap.details();
                 ap.displayDetails();
                 ap.calculatePay();
                 break;
    	 case 3: AssociateProfessor asp=new AssociateProfessor();
    	         asp.details();
                 asp.displayDetails();
                 asp.calculatePay();
                 break;
    	 case 4: Professor pro=new Professor();
    	         pro.details();
                 pro.displayDetails();
                 pro.calculatePay();
                 break;
    	 } 
     }
}
