package com.tap.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	private MyConnection()
	{
		
	}
	static private MyConnection connection=new MyConnection();
	public static MyConnection getMyConnection()
	{
		return connection;
	}
	public static Connection connect()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_june2024","root","Vineetha48@");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
}
