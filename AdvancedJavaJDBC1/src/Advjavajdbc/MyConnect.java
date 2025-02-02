package Advjavajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnect {
	private static String url="jdbc:mysql://localhost:3306/jdbc_june2024";
	private static String username="root";
	private static String password="Vineetha48@";
	
	static Connection con = null;
	static Connection connect() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection(url, username, password);
		return con;
		
	}
	static void close(ResultSet res,Statement stmt,Connection con)
	{
		try 
		{
			if(res!=null)
			{
			   res.close();
			}
			if(res!=null)
			{
			   stmt.close();
			}
			if(res!=null)
			{
			   con.close();
			}


			
//			System.out.println("resultset closed");
//			System.out.println("statement closed");
//			System.out.println("connection closed");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
//		stmt.close();  //these should not be first
//		res.close();
		
	public static void main(String[] args) {
		
	}

}
