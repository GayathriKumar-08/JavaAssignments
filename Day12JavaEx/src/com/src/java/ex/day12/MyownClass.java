package com.src.java.ex.day12;

public class MyownClass {
  public String name;
  public int age;
  
    public MyownClass(String name, int age) {
	super();
	this.name = name;
	this.age = age;
	
	
}

	@Override
	public String toString() {
		return "MyownClass [name=" + name + ", age=" + age + "]";
	}
}
