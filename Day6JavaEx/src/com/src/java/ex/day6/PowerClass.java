package com.src.java.ex.day6;

public class PowerClass<T extends Number> implements MathematicClass<T> {
	public int PowOf(T i)
	{
		return i.intValue() * i.intValue() ;
	}

}
