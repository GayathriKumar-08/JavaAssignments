package com.src.java.ex.day9;

import java.util.LinkedList;
import java.util.Scanner;

public class Employee {
	public int empno;
	public String empname;
	public String designation;
	
	public Employee(int empno, String empname, String designation) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", designation=" + designation + "]";
	}
	
	public static void main(String args[])
	{
		int empno=0;
		String empname=null,designation = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details:");
		
		System.out.println("Enter the size of list");
		int n=sc.nextInt();
		
		LinkedList<Employee> lli=new LinkedList<Employee>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the emp no:");
			 empno=sc.nextInt();
			System.out.println("Enter the emp name:");
			 empname=sc.next();
			System.out.println("Enter the emp designation:");
			 designation=sc.next();
			 lli.add(new Employee(empno,empname,designation));
		}
		
		for(int i=0;i<lli.size();i++)
		{
			System.out.println("Employee Details"+i+" "+lli.get(i));
		}
		System.out.println("The element is: " + lli.get(2));
		System.out.println("Removing Element from last:"+lli.remove());
	}

}
