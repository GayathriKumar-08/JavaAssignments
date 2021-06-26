package com.src.java.ex.day4;

public class MarkOBException extends Exception {

	private float mark;
	MarkOBException(float mark)
	{
		this.mark=mark;
	}
	@Override
	public String toString() {
		return "MarkOBException [mark=" + mark + "]";
	}
}
