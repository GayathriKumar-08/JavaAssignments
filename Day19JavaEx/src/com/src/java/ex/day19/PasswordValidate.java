package com.src.java.ex.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidate {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your user name");
	  String uname=sc.next();
	  System.out.println("Enter your password for validating");
	  String pass=sc.next();
	  
	  String regex="^[A-Za-z]\\w{5,12}$";
	  String regex1 = "^(?=.*[0-9])"
              + "(?=.*[a-z])(?=.*[A-Z])"
              + "(?=.*[@#$%^&+=])"
              + "(?=\\S+$).{8,20}$";
	  
	  Pattern patt1=Pattern.compile(regex);
	  Pattern patt2=Pattern.compile(regex1);
	  
	  Matcher match1=patt1.matcher(uname);
	  Matcher match2=patt2.matcher(pass);
	  
	  if(match1.matches() && match2.matches())
	  {
		  System.out.println("Entered username and password are valid");
	  }
	  else
	  {
		  System.out.println("Entered username or password is invalid");
	  }
	  System.out.println("Details are:");
	  System.out.println("------------------");
	  System.out.println("Username: "+uname);
	  System.out.println("Password: "+pass);
	}
}
