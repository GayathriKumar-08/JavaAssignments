package com.src.java.ex.day9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx2 {
		public static void main(String args[])
		{
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

			System.out.println("Map: " + map);

			int minKey = Collections.min(map.keySet());

			
			int maxKey = Collections.max(map.keySet());

			System.out.println("Minimum: "+ minKey);
			System.out.println("Value:"+map.get(minKey));

		
			System.out.println("Maximum: " + maxKey);
			System.out.println("Value:"+ map.get(maxKey));
		}
	}
