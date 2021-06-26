package com.src.java.day4.ex4;

import com.src.java.ex.day4.MarkOBException;

public class Employee {
	int empno;
	String empname;
	int bpay;

	Employee(int empno,String empname,int bpay)
	{
		this.empno=empno;
		this.empname=empname;
		this.bpay=bpay;
	}
	 public void display()
     {
    	 System.out.println("Details of Employee");
    	 System.out.println("---------------------------------------");
    	 System.out.println("Employee No: "+empno);
    	 System.out.println("Employee Name: "+empname);
    	 try {
    	 if(bpay > 10000 || bpay < 5000)
    	 	 throw new PayOBException(bpay);
    	     System.out.println("Basic Pay: "+bpay);
    	 }catch(PayOBException e)
    	 {
    		 System.out.println("Error: "+e);
    	 }
     }
}
