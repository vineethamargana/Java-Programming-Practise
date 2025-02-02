/*
  fetching all the data from the database
 */

package Advjavajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Selectingdata {
	public static void main(String[] args) 
	{
//		String url="jdbc:mysql://localhost:3306/jdbc_june2024";
//		String username="root";
//		String password="Vineetha48@";
		
		Connection con = null;
		Statement stmt=null;
		ResultSet res=null;
		int id,salary;
		String name,dept;
		
		try 
		{
			/*
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
		    con= DriverManager.getConnection(url, username, password);
			System.out.println("connection to db is established  "+con);
		    System.out.println(con);
		    */
			
			
			con=MyConnect.connect();
		    stmt=con.createStatement();
		   // System.out.println(stmt);
		    
			res=stmt.executeQuery("Select * from `Employee`");
		//	System.out.println(res);
			while(res.next())
			{
				id=res.getInt(1);
			    name=res.getString(2);
			    dept=res.getString(3);
			    salary=res.getInt(4);
				//System.out.println(id+"   "+name+"   "+dept+"   "+salary);
			    System.out.printf("%d %-9s %-10s %d\n",id,name,dept,salary);
			}
			
		} 
	   catch (ClassNotFoundException | SQLException e)//****************
		{
			e.printStackTrace();
		} 
		finally
		{
			MyConnect.close(res, stmt, con);
		}
	}
	
	/*
	static void close(ResultSet res,Statement stmt,Connection con)
	{
		try 
		{
			res.close();
			System.out.println("resultset closed");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			stmt.close();
			System.out.println("statement closed");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			con.close();
			System.out.println("connection closed");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
//		stmt.close();  //these should not be first
//		res.close();
		
	}
	*/

}
