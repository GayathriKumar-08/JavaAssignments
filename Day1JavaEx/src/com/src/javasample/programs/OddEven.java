package com.src.javasample.programs;

public class OddEven {
	
	public static void main(String args[])
	{
		int arr[]= {2,3,8,7,6};
		System.out.println("Odd Numbers");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 !=0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Even Numbers");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 ==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
