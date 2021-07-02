package com.src.java.ex.day10;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class BankDetails {
  private String name;
  private int accno;
  private int balance;
  



	public BankDetails(String name, int accno, int balance) {
	super();
	this.name = name;
	this.accno = accno;
	this.balance = balance;
}
	
	@Override
public String toString() {
	return "BankDetails [name=" + name + ", accno=" + accno + ", balance=" + balance + "]";
}

	public static void main(String args[])
	{
		 
        System.out.println("Balance checking.........");
		
		
		BankDetails bd=new BankDetails("abc",123456789, 600000);
		BankDetails bd1=new BankDetails("bca",234567891, 75000);
		BankDetails bd2=new BankDetails("cde",345678921, 850000);
	
		TreeMap<Integer,BankDetails> tmap=new TreeMap<Integer,BankDetails>(); 
		
		tmap.put(1,bd);
		tmap.put(2, bd1);
		tmap.put(3, bd2);
		
		
		System.out.println("Account Number and Balance");
		System.out.println("---------------------------");
	
        for (Entry<Integer, BankDetails> e : tmap.entrySet())
            System.out.println("Your Account Balance is "+e.getKey()+ " "+ e.getValue());
       
	}
  
  
}
