package com.src.java.ex.day19;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMethodsEx {
	
	public static void main(String args[])
	{
		RegexMethodsEx rm;
		String str = " ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
	
			switch(n1)
			{
			case 1:System.out.println("Enter the string splitting:");
			str=sc.next();
			rm=new RegexMethodsEx();
			rm.splitMethod(str);
			break;
			
			case 2:	System.out.println("Enter the string finding:");
			str=sc.next();
			rm=new RegexMethodsEx();
			rm.findMethod(str);
			break;
			
		
			case 3:System.out.println("Enter the string grouping:");
				str=sc.next();
				rm=new RegexMethodsEx();
				rm.groupMethod(str);
				break;
			}
		}


	private void splitMethod(String str) {
		
		String[] s = str.split("[,.!]+");
        for(int i=0;i<s.length;i++)
        {
        	System.out.println("Splitted words are:"+s[i]);
        }
        
	}
	private void findMethod(String str) {
		
		String regex="ab";
		
		Pattern patt=Pattern.compile(regex);
		 Matcher matcher= patt.matcher(str);
		 
		 System.out.println(matcher.find());
	}
	private void groupMethod(String str) {
	    String regex="(g*g)";
	    Pattern patt= Pattern.compile(regex);
	    Matcher match=patt.matcher(str);
	    
//	    MatchResult result= match.toMatchResult();
//	        System.out.println("Result: "+ result);
	        
	      while (match.find()) {
	          
	            System.out.println(match.group());
	        }
		}

}
