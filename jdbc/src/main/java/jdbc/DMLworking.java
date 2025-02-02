package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLworking {
	private static String query1 ="insert into employee(id,name,designation,salary) values (4,'prabhu','cheif','1200')";
	private static String query2="update `employee` set `name`='manu' where `id`= 4 ";
	private static String query3= "delete from employee where id=4";
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Vineetha48@");
			
			Statement stmt = con.createStatement();
			
			//inserting data
//			int res1=stmt.executeUpdate(query1);
//			System.out.println(res1);
			
			
			
			//updating data
//			int res2=stmt.executeUpdate(query2);
//			System.out.println(res2);
			
			
			//deleting data
			int res3=stmt.executeUpdate(query3);
			System.out.println(res3);
			
			
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
