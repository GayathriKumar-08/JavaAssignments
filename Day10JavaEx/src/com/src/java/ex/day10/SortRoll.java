package com.src.java.ex.day10;

import java.util.Comparator;

public class SortRoll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		 return o1.rollno - o2.rollno;
	}
 
}

class SortName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}