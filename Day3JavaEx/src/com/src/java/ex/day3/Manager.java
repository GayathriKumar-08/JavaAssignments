package com.src.java.ex.day3;

public class Manager extends Person {
	String specialization;
	String department;

	public void disp()
	{
		System.out.println("Specialization: "+specialization);
		System.out.println("Department: "+department);
	}
}
