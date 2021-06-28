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
public static void main(String args[])
{
	System.out.println("Maximum is: "+ max(3,4,5,6));
	System.out.println("Maximum is:"+max(23f,4f,8f));
	System.out.println("Maximum is: "+max("pears","apple","watermelon"));
}
}
