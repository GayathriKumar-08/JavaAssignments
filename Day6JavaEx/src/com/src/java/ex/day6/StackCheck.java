package com.src.java.ex.day6;

public class StackCheck {
	public static void main(String arg[])
	{
	Stack<Integer> si=new Stack<Integer>();  // creating a Stack that holds a set of Integer objects
	Stack<Double> sd=new Stack<Double>();  // creating a Stack that holds a set of Double objects
	Stack<Student> ss=new Stack<Student>();  // creating a Stack that holds a set of Student
	si.push(10);
	si.push(20);
	si.push(30);
	 
	sd.push(1.20);
	sd.push(2.25);
	sd.push(48.789);
	sd.push(0.10);
	 
	ss.push( new Student("gayu",4) );
	ss.push( new Student("keethu",8) );
	ss.push( new Student("priya",12) );
	 
	System.out.println("\nTntegers...");
	while(si.hasElements())
	{
	System.out.println(si.pop());
	}
	 
	System.out.println("\nDoubles...");
	while(sd.hasElements())
	{
	System.out.println(sd.pop());
	}
	 
	System.out.println("\nStudents...");
	while(ss.hasElements())
	{
	System.out.println(ss.pop());
	}
	}
}