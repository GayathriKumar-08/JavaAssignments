package com.src.java.exday20.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateQuery {
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
			
			System.out.println("Enter the student rollno for updating");
			int studid = sc.nextInt();
			System.out.println("Enter the student name that you want to change:");
			String studname=sc.next();
			
			int e=s.executeUpdate("update `mydb`.`student`set studname='"+studname+"'where studid="+studid );
			if(e>0)
			{
				System.out.println("records are update successfully");
			}
			else
			{	
				System.out.println("invalid updation process");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
