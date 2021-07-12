package com.src.java.ex.day18;

import java.io.Serializable;

public class EmployeeDetails implements Serializable {
	   public String empname;
	   public String empaddress;
	   public transient int empaccnumber;
	   public int empid;
	   
	   EmployeeDetails()
	   {
		   
	   }

	@Override
	public String toString() {
		return "EmployeeDetails [empname=" + empname + ", empaddress=" + empaddress + ", empaccnumber=" + empaccnumber
				+ ", empid=" + empid + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	   
}
