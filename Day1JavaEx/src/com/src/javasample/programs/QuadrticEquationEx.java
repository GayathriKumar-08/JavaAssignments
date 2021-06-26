package com.src.javasample.programs;

import java.util.Scanner;

public class QuadrticEquationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            float a,b,c;
            double first, second;
       
     	   Scanner sc=new Scanner(System.in);
     	   System.out.println("Enter the a value");
     	   a=sc.nextFloat();
     	   System.out.println("Enter the b value");
    	   b=sc.nextFloat();
    	   System.out.println("Enter the c value");
     	   c=sc.nextFloat();
     	   
     	   double top=(b*b)-(4*a*c);
     	   double sqrt=Math.sqrt(top);
     	   
     	 if(top>0)
     	 {
     		 first=(-b + sqrt)/(2*a);
     		 second=(-b - sqrt)/(2*a);
     		 
     		 System.out.println("Roots"+ first +" and "+second);
     	 }
     	 else
     	 {
     		 System.out.println((-b + sqrt)/(2*a));
     	 }
	}

}
