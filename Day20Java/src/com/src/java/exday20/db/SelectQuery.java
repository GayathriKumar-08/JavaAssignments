package com.src.java.exday20.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectQuery {
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
			ResultSet rs=s.executeQuery("Select * FROM `mydb`.`student`");
			
			while(rs.next())
			
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+rs.getInt(3));
				c.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
