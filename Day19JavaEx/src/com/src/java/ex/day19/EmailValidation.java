package com.src.java.ex.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
  
	public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your user name");
	  String uname=sc.next();
	  System.out.println("Enter your email id for validating");
	  String emailid=sc.next();
	  
	  String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	  String regex1="^[A-Za-z]\\w{4,20}$";
	  
	  Pattern patt=Pattern.compile(regex);
	  Pattern patt1=Pattern.compile(regex1);
	  
	  Matcher match=patt.matcher(emailid);
	  Matcher match1=patt1.matcher(uname);
	  
	  if(match1.matches() && match.matches()) {
	         System.out.println("your username and email id is valid");
	      } else {
	         System.out.println("your username or email id is invalid");
	      }
	  System.out.println("Details are:");
	  System.out.println("------------------");
	  System.out.println("Name: "+uname);
	  System.out.println("Email-Id: "+emailid);
    }
}
