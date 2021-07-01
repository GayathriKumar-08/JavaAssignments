package com.src.java.ex.day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
 public static void main(String args[])
 {
	 System.out.println("Hash Map");
	 HashMap<Integer,String> map= new HashMap<Integer,String>();
     Scanner sc=new Scanner(System.in);
     
	System.out.println("Enter the size:");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++) {
		
		System.out.println("Enter the key:");
		int k =sc.nextInt();
		
		System.out.println("Enter the value:");
		String v=sc.next();
		
		map.put(k, v);
	}
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
 }
}
