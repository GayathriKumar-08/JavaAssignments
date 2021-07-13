package com.src.java.ex.day19;

public class Test {
	  private String studname;
	
	    
	    public Test()  {
	    }
	  
	  
	    public void displayName(String name)  {
	        this.studname=name;
	        System.out.println("StudentName: "+name);
	    }
	    public void displayNo(int n)  {
	      System.out.println("Number: "+n);
	    }

	    private void display() {
	        System.out.println("Private method invoked");
	    }
	}
