package com.src.java.ex.day13;

public class StudentClass {
	
	public int rollno;
	public String name;
	public int age;
	
	public StudentClass() {
	
	}

	public StudentClass(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentClass [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	public void display()
	{
		System.out.println(".......................");
		System.out.println("Student roll no:"+rollno);
		System.out.println("Student name:"+name);
		System.out.println("Student age:"+age);
	}
	
}
