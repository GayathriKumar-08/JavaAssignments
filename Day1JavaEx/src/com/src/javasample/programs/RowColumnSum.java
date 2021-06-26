package com.src.javasample.programs;

public class RowColumnSum {
	public static void main(String args[])
	{
		int a[][]= {{1,2,3},{2,1,4},{4,1,2}};
		 int sumrow;
		 
		
		 for(int i=0;i<a.length;i++) {
			  sumrow=0;
			 for(int j=0;j<a[0].length;j++) {
				 sumrow+=a[i][j];
			 }
			 System.out.println(" row: " + sumrow);  
		 }
		 for(int i=0;i<a[0].length;i++) {
			  sumrow=0;
			 for(int j=0;j<a.length;j++) {
				 sumrow+=a[j][i];
			 }
			 System.out.println(" col: " + sumrow);  
		 }
	}
}
