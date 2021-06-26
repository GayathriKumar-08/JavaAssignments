package com.src.javasample.programs;

public class MatrixExample {
	public static void main(String args[])
	{
		int a[][]= {{1,2,3},{3,4,5},{6,7,8}};

		
		int b[][]= {{3,4,5},{6,7,8},{1,2,3}};
	
		
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
		System.out.println("Matrix addition");
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)	
			{
				c[i][j]=a[i][j]+b[i][j];
				  System.out.print(c[i][j]+" ");
			}
			 System.out.println();
		}
		System.out.println("Matrix mulitplication");
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)	
			{
				c[i][j]=a[i][j]*b[i][j];
				  System.out.print(c[i][j]+" ");
			}
			 System.out.println();
		}
	}

}
