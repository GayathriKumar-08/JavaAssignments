package com.src.java.ex.day12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashTableEx {
  public static void main(String args[])
  {
	    int num;
	    String name;
	    int age;
	    Hashtable<Integer,MyownClass> hash = new Hashtable<Integer,MyownClass>();
	
		MyownClass mc=new MyownClass("gayu",23);
		MyownClass mc1=new MyownClass("daisy",24);
		MyownClass mc2=new MyownClass("arya",23);
		MyownClass mc3=new MyownClass("vv",24);
		MyownClass mc4=new MyownClass("keerthi",22);
	   
		hash.put(1,mc);
		hash.put(2,mc1);
		hash.put(3,mc2);
		hash.put(4,mc3);
		hash.put(5,mc4);
	
	    System.out.println("Elements in hashtable:");
	
	    Set<Integer> keys = hash.keySet();
	 
	    Iterator<Integer> itr = keys.iterator();
	 
	    while (itr.hasNext()) { 
	    	num = itr.next();
	       System.out.println("Key: "+num+" & Value: "+hash.get(num));
	    } 
	 }
  }
