package com.src.java.day4.ex4;

public class PayOBException extends Exception {

	private int bpay;
	PayOBException(int bpay)
	{
		this.bpay=bpay;
	}
	@Override
	public String toString() {
		return "PayOBException [bpay=" + bpay + "]";
	}
	
}
