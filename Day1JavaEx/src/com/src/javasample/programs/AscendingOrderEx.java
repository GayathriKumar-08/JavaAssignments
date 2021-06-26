package com.src.javasample.programs;

public class AscendingOrderEx {
	
	public static void main(String args[])
	{
		System.out.println("before ascending order");
		
		int temp=0;
		int arr[]= {50,30,40,20,10};
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("after ascending order");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
