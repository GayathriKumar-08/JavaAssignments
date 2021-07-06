package com.src.java.ex.day13;

import java.util.Scanner;

public class VowelWords {
	
	private void vowelsCount(String str) {
		int i;
		int vowels=0;
		 for(i=0;i<str.length();i++)
         {
      	   char ch=str.charAt(i);
      	   if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
      	   {
      		   vowels++;
      	   }
         }
		  System.out.println("Number of vowels in the given sentence is "+vowels);
	}
	
	private void wordCount(String str) {
		int count=0;
		
		  char ch[]= new char[str.length()];     
          for(int i=0;i<str.length();i++)  
          {  
              ch[i]= str.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
	      System.out.println("Number of words in the given sentence is "+count);
	}

	 public static void main(String args[])  
	   {  
		
		 String str = " ";
		 Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the string");
	         	 
	    	   str=sc.nextLine();
	           System.out.println("Strings are: "+str);
	         
	           VowelWords vw=new VowelWords();
	           vw.vowelsCount(str);
	           vw.wordCount(str);
	      
	   }
}
