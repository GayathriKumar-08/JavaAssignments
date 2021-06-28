package com.src.java.ex.day6;

public class Pair<K, V> {

	    private K key;
	    private V value;

	    public Pair(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }
	    public void display()
	    {
	    	System.out.println("Key:"+key+""+"Value:"+value);
	    }

	    // ...
	    public static void main(String args[])
	    {
	    	//Pair<int, char> p = new Pair<>(8, 'a');  // compile-time error
	    	//Pair<Integer, Character> p = new Pair<>(8, 'a');  // compile-time error
	    //	System.out.println(p);
	    	//Always better to give Like this
	    	Pair<Integer, Character> p1 = new Pair<>(Integer.valueOf(8), new Character('a'));
	    	System.out.println(p1);
	    	p1.display();
	    }
	}