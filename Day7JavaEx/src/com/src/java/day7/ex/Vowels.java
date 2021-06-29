package com.src.java.day7.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Vowels {

 public static void main(String args[])
  {
	 int vowels=0,consonant=0,digits=0,spechar=0,count=0, wc=0; 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the file name:");
	String fname=sc.nextLine();
	try {
	 File f1=new File(fname); 
     String[] words=null;  
     String s;
     FileReader fr = new FileReader(f1);    
     BufferedReader br = new BufferedReader(fr);
     while((s=br.readLine())!=null)
     {
    	 words=s.split(" ");   //Split the word using space
         wc=wc+words.length;   //increase the word count for each word
         
    	 for(int i=0;i<s.length();i++)
    	 {
    		 char ch=s.charAt(i);
    	
    		  if ( (ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z') ) {
    			 ch=Character.toLowerCase(ch);
    			 
    			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    				 vowels++;
    		     else
    	         consonant++;
    		  }
    		  else if (ch >= '0' && ch <= '9')
                  digits++;
    		  else
    			  spechar++;
    		  }
    	 for(int i = 0; i < s.length(); i++) {    
             if(s.charAt(i) != ' ')    
                 count++;    
             
         }    
    	 }
         System.out.println("Vowels:"+vowels);
         System.out.println("consonants:"+consonant);
         System.out.println("digits:"+digits);
         System.out.println("Count:"+count);
         System.out.println("Word Count:"+wc);
     
   
	}catch(IOException e) {
		System.out.println("Error:"+e);
	}
  }
}
