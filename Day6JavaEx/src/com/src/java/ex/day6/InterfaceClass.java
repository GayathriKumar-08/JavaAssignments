package com.src.java.ex.day6;

public class InterfaceClass {
	
	public static void main(String args[])
	{
		System.out.println("Interface generics");
		PowerClass<Float> pc =new PowerClass<Float>();
		System.out.println("5 ^ 2: "+ pc.PowOf(5f));
	}

}
