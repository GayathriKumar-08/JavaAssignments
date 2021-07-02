package com.src.java.ex.day10;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Employee {
	public int empno;
	public String empname;
	public String designation;
	private int quantity;
	
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
		 String empname="";
		 String designation="";
		 
		Employee emp=new Employee(101,"keerthi","programmer");
		Employee emp1=new Employee(102,"arya","hr");
		Employee emp2=new Employee(103,"daisy","manager");
		Employee emp3=new Employee(102,"veveliya","hr");
		
		Map<Integer,Employee> tm=new TreeMap<Integer,Employee>();
	
		tm.put(1, emp);
		tm.put(2, emp1);	
		tm.put(3, emp2);	
		tm.put(4, emp3);	
	
		System.out.println("Tree Map elements: "+tm);
		
		System.out.println("Traversing .....");
	        for (Entry<Integer, Employee> e : tm.entrySet())
	            System.out.println(e.getKey()+ " "+ e.getValue());
	        
		System.out.println("Removing................");
		tm.remove(1);
		System.out.println(tm);
		
	}
}
