package Advjavajdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingData {
	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/jdbc_june2024";
		String username="root";
		String password="Vineetha48@";
		try {
			//1.loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(url,username,password);
			
			//2.establish conectionto database
			con=DriverManager.getConnection( url,username,password);
			
			//3.create sql statement
			String sql="update `employee` set `salary`=`salary` +5000 where `dpt`='Tester'";
			stmt=con.createStatement();
			
			//4.execute sql statement
			int x=stmt.executeUpdate(sql);
			if(x!=0)
			{
				System.out.println("update success");
			}
			else
			{
				System.out.println("update failure");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		  try {
			  if(stmt!=null)
				{
				  stmt.close();
				} 
				if(con!=null)
				{
				   con.close();
				}	
			}
	     catch (SQLException e)
	       {
		       e.printStackTrace();
	       }
	   }
	}
}


