package com.src.java.ex.day6;

public class Stack<E> {
	     E a[];
		int top;
		Stack()
		{
			a=(E[])new Object[100];
			top=-1;
		}
		public void push(E data)
		{
			a[++top]=data;
		}
		E pop()
		{
		return a[top--];
		}
		boolean hasElements()
		{
		return top!=-1;
		}
		 
		
}