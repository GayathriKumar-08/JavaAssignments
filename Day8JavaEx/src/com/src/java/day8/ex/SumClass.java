package com.src.java.day8.ex;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SumClass {

	public static void main(String args[])
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size of the array:");
		   
		  int size=sc.nextInt();
		  int n;
		  
		  for(int i=0;i< size;i++)
		  {
			  System.out.println("Enter the number:");
			  n=sc.nextInt();
			  ts.add(n);
		  }
           System.out.println("TreeSet Elements: "+ts);
           
           //<------------------------------------------------------------------------------------------------>
    	  //for loop sum starts here
    	    int sum=0;
             for (Integer value : ts)
     	     {
       	    	sum=sum+value;
      	    }
         	    System.out.println("For loop sum: "+sum);
         	    
        //<------------------------------------------------------------------------------------------------>
        //while loop sum starts here
	        int result=0;
	      Iterator<Integer> itr = ts.iterator();
	       while(itr.hasNext())
	       {
	    	int g=itr.next();
	    	result=result+g;	    	
	    }
	    System.out.println("While loop sum: "+result);
	    
	    //<------------------------------------------------------------------------------------------------>
	    //Recursion starts here
	        int num = ts.size(); 
	        int arr[] = new int[num]; 
	        int i=0;
	        
	        for (int ele : ts) 
	            arr[i++] = ele; 
	       
	        int sum1=cal(arr,arr.length);
	        System.out.println("Recusrion Sum: "+sum1);
		}
      
		private static int cal(int arr[], int n)
		{
			if (n <= 0) {
	            return 0;
	          }
	           
	          return cal(arr, n-1 ) + arr[n-1];
	}
}
