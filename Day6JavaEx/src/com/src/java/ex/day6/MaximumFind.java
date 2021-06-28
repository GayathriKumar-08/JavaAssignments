package com.src.java.ex.day6;

public class MaximumFind{

public static <T extends Comparable<T>> T max(T... elements){
	T max=elements[0];
	for (T element:elements)
	{
		if(element.compareTo(max) > 0) {
			max = element;
		}
	}

   return max;
  }
public static <T extends Comparable<T>> T min(T... elements){
	T min=elements[0];
	for (T element:elements)
	{
		if(element.compareTo(min) < 0) {
			min = element;
		}
	}

   return min;
  }
public static void main(String args[])
{
	 System.out.println("------------Maximum----------------------------");
	System.out.println("Maximum is: "+ max(Integer.valueOf(3),Integer.valueOf(3),Integer.valueOf(4),Integer.valueOf(5),Integer.valueOf(6)));
	System.out.println("Maximum is:"+max(Float.valueOf(23f),Float.valueOf(4f),Float.valueOf(8f)));
	System.out.println("Maximum is: "+max("pears","apple","watermelon"));
	 System.out.println("Boolean Max: " + max(Boolean.TRUE, Boolean.FALSE));
	 
	 System.out.println("------------Minimum----------------------------");
	 System.out.println("Maximum is: "+ min(Integer.valueOf(3),Integer.valueOf(3),Integer.valueOf(4),Integer.valueOf(5),Integer.valueOf(6)));
		System.out.println("Maximum is:"+min(Float.valueOf(23f),Float.valueOf(4f),Float.valueOf(8f)));
		System.out.println("Maximum is: "+min("pears","apple","watermelon"));
		 System.out.println("Boolean Max: " + min(Boolean.TRUE, Boolean.FALSE));
}
}
