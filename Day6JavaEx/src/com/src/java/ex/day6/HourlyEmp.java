package com.src.java.ex.day6;

import java.util.LinkedList;
import java.util.Queue;

public class HourlyEmp extends Employee {

public double hrrate;


	public HourlyEmp(String name, int age, double hrrate) {
		super(name, age);
		this.hrrate=hrrate;
	}
	 public static void main(String[] args) {
		    
		    Queue<HourlyEmp> qe=new LinkedList<>();
		    qe.add(new HourlyEmp("gayu", 101,250.0));
		    qe.add(new HourlyEmp("keerthu", 102,250.0));
		    qe.add(new HourlyEmp("vv", 103,250.0));
		    //System.out.println(qe);
		    System.out.println("Elements of queue "
                    + qe);
		    
		    HourlyEmp removed = qe.remove();
	        System.out.println("removed element-"
	                           + removed);
	  
	        System.out.println(qe);
	  
	      
	        int size = qe.size();
	        System.out.println("Size of queue-"
	                           + size);
	 }

}
