package com.src.java.day2ex;

public class Room {
	int roomno;
	String roomtype;
	String roomarea;
	String acmachine;
	
	public void setData(int roomno,String roomtype,String roomarea,String acmachine)
	{
		this.roomno=roomno;
		this.roomtype=roomtype;
		this.roomarea=roomarea;
		this.acmachine=acmachine;
	}
	public void display()
	{	
		System.out.println("Room details:");
		System.out.println("Room No:"+roomno);
		System.out.println("Room No:"+roomtype);
		System.out.println("Room No:"+roomarea);
		System.out.println("Room No:"+acmachine);
	}
	

	public static void main(String args[])
	{
		Room r1=new Room();
		Room r2=new Room();
		r1.setData(101, "deluxe","100sq", "available");
		r2.setData(102, "normal", "100sq", "not-available");
		r1.display();
		r2.display();
	
	}

}
