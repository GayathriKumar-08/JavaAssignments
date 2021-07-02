package com.src.java.ex.day10;

import java.util.TreeMap;
import java.util.Map.Entry;

public class PnoClass {
 String name;
 int pno;
public PnoClass(String name, int pno) {
	super();
	this.name = name;
	this.pno = pno;
}
@Override
public String toString() {
	return "PnoClass [name=" + name + ", pno=" + pno + "]";
}
 public static void main(String args[])
 {
	 TreeMap<Integer,PnoClass> tmap=new TreeMap<Integer,PnoClass>(); 

		PnoClass p1=new PnoClass("keerthi", 123456);
		PnoClass p2=new PnoClass("arya", 234567);
		PnoClass p3=new PnoClass("daisy", 345678);
		PnoClass p4=new PnoClass("vv", 456789);
		tmap.put(1, p1);
		tmap.put(2, p2);
		tmap.put(3, p3);
		tmap.put(4, p4);
		
		for (Entry<Integer, PnoClass> e : tmap.entrySet())
            System.out.println(e.getKey()+ " "+ e.getValue());
		
 }
}
