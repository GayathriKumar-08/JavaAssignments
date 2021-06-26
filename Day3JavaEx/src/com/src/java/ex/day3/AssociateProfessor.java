package com.src.java.ex.day3;

import java.util.Scanner;

public class AssociateProfessor extends Employee {
	 double bp,hra,da,pf,scf;
	 double grosssal, netsal;
	 Scanner sc=new Scanner(System.in);
	 AssociateProfessor()
	 {
		System.out.println("Associate Professor!!!!");
	 }
	 
	 public void calculatePay()
	 {
		 System.out.println("Enter the basic pay");
		 bp=sc.nextDouble();
		 da=0.97 * bp;
		 hra=0.10 * bp;
		 pf=0.12 * bp;
		 scf=0.001 * bp;
		 
		 grosssal=bp+da+hra;
		 netsal=grosssal-pf-scf;
		 
		 System.out.println("\t\tSalary Details");
		 System.out.println("-----------------------------------------");
		 System.out.println("Basic Pay: "+bp);
		 System.out.println("Dearness Allowance: "+da);
		 System.out.println("House Rent Allowance "+hra);
		 System.out.println("PF: "+pf);
		 System.out.println("Staff Club Fund "+scf);
		 System.out.println("Gross Salary: "+grosssal);
		 System.out.println("Net Salary: "+netsal);
		 
	 }
}
