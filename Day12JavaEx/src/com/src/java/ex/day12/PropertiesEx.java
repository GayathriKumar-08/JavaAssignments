package com.src.java.ex.day12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class PropertiesEx {
	
public static void main(String[] args)throws Exception{  
		
		Properties p=new Properties();  
		
		System.out.println("Setting my property");
		
		p.setProperty("uname","abc@123");  
		p.setProperty("pass","pass123");  
		p.setProperty("accesskey","hello123");  
		  
		p.store(new FileWriter("prop.txt"),"PropertiesEx");  
	
		PropertiesEx pe=new PropertiesEx();
	 pe.readMethod();

	 
	 }  


	private void readMethod() throws IOException {
  
		 FileReader reader=new FileReader("prop.txt");  
	      
		    Properties p=new Properties();  
		    p.load(reader);  
		      
		    System.out.println(p.getProperty("uname"));  
		    System.out.println(p.getProperty("pass"));  
		    System.out.println(p.getProperty("accesskey"));  
		    System.out.println("-------------------------------------------------");
	}

}

