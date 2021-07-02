package com.src.java.ex.day10;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class BalanceClass {
	public static void main (String args[])
	{
		System.out.println("Balance checking.........");
		
		TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>(); 
		
		tmap.put(123456789, 600000);
		tmap.put(234567891, 75000);
		tmap.put(345678921, 850000);
		tmap.put(456789123, 50000);
		tmap.put(567891234, 100000);
		tmap.put(678912345, 40000);
		tmap.put(789123456, 85000);
		
		System.out.println("Account No and Balance");
		System.out.println("---------------------------");
	
        for (Entry<Integer, Integer> e : tmap.entrySet())
            System.out.println(e.getKey()+ " "+ e.getValue());
        
        System.out.println("Check for balance");
        System.out.println("---------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number");
         int ac=sc.nextInt();
         
         if(tmap.containsKey(ac))
         {
        	 int value=tmap.get(ac);
        	 System.out.println("Your balance Amout: "+value);
         }else
         {
        	 System.out.println("invalid account number");
         }
        
	}

}
