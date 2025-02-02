package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	private static String url ="jdbc:mysql://localhost:3306/practise";
	private static String password="Vineetha48@";
	private static String username="root";

	public static void main(String[] args) {
		try 
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			//establish the connection
			//connection is established using the DriverManager class and getConnection method by creating object for the Connection interface
			
			Connection con = DriverManager.getConnection(url ,username,password);
			System.out.println("connection is established");
			
			//Creating statement by creating object for the statement interface
			Statement stmt= con.createStatement();
			
			//Execute sql queries
			String query = "select * from employee";
			String query2 = "select * from employee where id=1";
			ResultSet res = stmt.executeQuery(query);
			//System.out.println(res);
			while(res.next()== true) 
			{
				//method1
//				int id = res.getInt(1);
//				String name=res.getString(2);
//				String designation = res.getString(3);
//				float salary = res.getFloat(4);
//				System.out.println(id+" "+name+" "+designation+" "+salary);
				
				
				//method2
//				int id = res.getInt("id");
//				String name=res.getString("name");
//				String designation = res.getString("designation");
//				float salary = res.getFloat("salary");
//				
//				System.out.println(id+" "+name+" "+designation+" "+salary);
				
				
				//method3
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getFloat(4));
			}
			
			//meta data
			ResultSetMetaData meta = res.getMetaData();
			int colc = meta.getColumnCount();
			System.out.println(colc);
			
			for(int i=1; i<=colc;i++)
			{
				System.out.println("column name:" +meta.getColumnName(i)+" "+meta.getColumnTypeName(i));
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
