package com.tap.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionUser {
	private MyConnectionUser()
	{
	}
	static private MyConnectionUser connection=new MyConnectionUser();
	public static MyConnectionUser getMyConnectionUser()
	{
		return connection;
	}
	public static Connection connect()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_food_delivery","root","Vineetha48@");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}

