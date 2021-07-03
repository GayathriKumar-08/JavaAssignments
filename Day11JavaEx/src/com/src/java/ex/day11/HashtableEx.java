package com.src.java.ex.day11;

import java.util.Hashtable;

public class HashtableEx {
public static void main(String[] args) {
		
		  Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		  ht.put(1, "arya"); 
		  ht.put(10 ,"daisy"); 
		  ht.put(14,"shiny"); 
		  ht.put(84, "gayu"); 
		  ht.put(31, "keerthi"); 
		  ht.put(62, "vv"); 
		 
		System.out.println("Elements in the hash table are: \n" +ht);
		System.out.println("");
		int size = ht.size();
		System.out.println("size of hash table: \n" +size);
		System.out.println("");
 
		 String rep=ht.replace(2, "daisy-mary");
		 System.out.println("Replaced list:"+rep);
		
		  String rem = ht.remove(1);
		  System.out.println("after removal: \n" +rem);
		  System.out.println("");
		  System.out.println("updated entries: \n" +ht);
		  System.out.println("");
		
		   String getValue = ht.get(84);
		   
		   System.out.println("value of key-48: \n" +getValue);
		   System.out.println("");
		   System.out.println("value of key-14: \n" +ht.get(14));
		   System.out.println("");

	}
}
