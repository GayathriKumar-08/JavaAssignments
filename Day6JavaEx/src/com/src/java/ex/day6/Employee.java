package com.src.java.ex.day6;

public class Employee {
	String name;
	int age;

	public Employee() {
		//empty constructor
	}
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}
