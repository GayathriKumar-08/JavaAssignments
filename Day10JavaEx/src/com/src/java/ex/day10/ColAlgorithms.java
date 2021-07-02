package com.src.java.ex.day10;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class ColAlgorithms {

public static void main(String[] args) {
    
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
    ll.add(-8);
    ll.add(20);
    ll.add(-20);
    ll.add(8);
    
    Comparator rev = Collections.reverseOrder();
    
  
    Collections.sort(ll, rev);
     
    Iterator li = ll.iterator();
    System.out.print("List sorted in reverse: ");
    
    while(li.hasNext()) {
       System.out.print(li.next() + " ");
    }
    System.out.println();
    Collections.shuffle(ll);
    
   
    li = ll.iterator();
    System.out.print("List shuffled: ");
    
    while(li.hasNext()) {
       System.out.println(li.next() + " ");
    }

    System.out.println("Finding maximum and minimum");
    System.out.println("Minimum: " + Collections.min(ll));
    System.out.println("Maximum: " + Collections.max(ll));
 }
}
