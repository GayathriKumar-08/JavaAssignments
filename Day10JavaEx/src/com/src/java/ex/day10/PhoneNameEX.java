package com.src.java.ex.day10;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class PhoneNameEX {
	public static void main (String args[])
	{
		System.out.println("Phone number checking.........");
		
		TreeMap<String,Integer> tmap=new TreeMap<String,Integer>(); 
		
		tmap.put("keerthi", 123456);
		tmap.put("arya", 234567);
		tmap.put("daisy", 345678);
		tmap.put("vv", 456789);
		
		
		System.out.println("Phone number with names");
		System.out.println("---------------------------");
	
        for (Entry<String, Integer> e : tmap.entrySet())
            System.out.println(e.getKey()+ " "+ e.getValue());
        
        System.out.println("Check for phone number");
        System.out.println("---------------------------");
        
        PhoneNameEX pn=new PhoneNameEX();
        pn.getPno(tmap);
          
	}
	private void getPno(TreeMap<String, Integer> tmap) {
		
		 Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name");
       String name=sc.next();
       
       if(tmap.containsKey(name))
       {
      	 int value=tmap.get(name);
      	 System.out.println("Phone number: "+value);
       }
       else
       {
      	 System.out.println("invalid name");
       }
	}

//	private void getName(TreeMap<String, Integer> tmap) {
//		 Scanner sc = new Scanner(System.in);
//       System.out.println("Enter your phone number");
//        String pno=sc.next();
//        
//        if(tmap.containsValue(pno))
//        {
//       	 int value=tmap.get(pno);
//       	 System.out.println("Name: "+value);
//        }else
//        {
//       	 System.out.println("invalid phone number");
//        }
//		
//	}

	
}
