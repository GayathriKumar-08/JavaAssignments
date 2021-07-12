package com.src.java.ex.day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesrializationClass {

	public static void main(String[] args) 
	{
		EmployeeDetails emp=null;
    	 try {
    	
    	 
    	 FileInputStream fis=new FileInputStream("C:\\Users\\Gayathri.GK\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\Day18JavaEx\\EmployeeDetails.txt");
    	 ObjectInputStream ois=new ObjectInputStream(fis);
    	 emp = (EmployeeDetails) ois.readObject();
    	 ois.close();
    	 fis.close();
    	 System.out.printf("Serialized data is saved in as EmployeeDetails.ser");
    	 
    	 }catch(IOException e)
    	 {
    		e.printStackTrace();
    		 return;
         } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
         }

         System.out.println("Deserialized Employee...");
         System.out.println("Name: " + emp.empname);
         System.out.println("Address: " + emp.empaddress);
         System.out.println("AccountNumber: " + emp.empaccnumber);
         System.out.println("Number: " + emp.empid);
         
	}

}
