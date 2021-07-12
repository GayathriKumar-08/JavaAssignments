package com.src.java.ex.day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableClass {
	 public static void main(String args[])
     {
    	 try {
    	 EmployeeDetails emp=new EmployeeDetails();
    	 emp.empname="keerthi";
    	 emp.empaddress="perambur-chennai";
    	 emp.empaccnumber=12348912;
    	 emp.empid=101;
    	 
    	 FileOutputStream fos=new FileOutputStream("C:\\Users\\Gayathri.GK\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\Day18JavaEx\\EmployeeDetails.txt");
    	 ObjectOutputStream oos=new ObjectOutputStream(fos);
    	 oos.writeObject(emp);
    	 oos.close();
    	 fos.close();
    	 System.out.printf("Serialized data is saved in as EmployeeDetails.ser");
    	 
    	 }catch(IOException e)
    	 {
    		 System.out.println(e);
    	 }
     }
}
