package com.src.java.exday20.db;

import java.sql.*;
import java.util.Scanner;
public class ConnectionDB {
	static Connection c=null;
	static  String  dbname=" ";
	static String dburl="jdbc:mysql://localhost:3306/"+dbname;
	
	static String username="root";
	static String password="pass1234";
	
	public static void main(String a[]) throws InstantiationException, IllegalAccessException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection(dburl,username,password);
		}catch(ClassNotFoundException ce)
		{
			System.out.println(ce);
		}
		catch(SQLException sqe)
		{
			System.out.println("unable to connect"+sqe);
		}
		try
		{
			Statement s=c.createStatement();
			//int k=s.executeUpdate("insert into `mydb`.`student` (`studid`,`studname`,`studtotal`)values(101,'gayu',480)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the student details");
			System.out.println("------------------------------");
					
			System.out.println("Enter the student rollno");
			int studid = sc.nextInt();
			System.out.println("Enter the student name");
			String studname = sc.next();
			System.out.println("Enter the student total");
			int studtotal = sc.nextInt();
			
			int e=s.executeUpdate("INSERT INTO `mydb`.`student`  VALUES('"+ studid + "','" + studname + "','"+ studtotal+ "');");
			if(e>0)
			{
				System.out.println("records inserted successfully");
			}
			else
			{
				System.out.println("invalid insert");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
