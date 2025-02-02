package Advjavajdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Deletedata {
	private static Statement stmt;

	public static void main(String[] args) 
	{
		Connection con=null;
		try 
		{
			con=MyConnect.connect();
			stmt=con.createStatement();
			int x=stmt.executeUpdate("delete from `Employee` where `empid`=8");
			if(x!=0)
			{
				System.out.println("data deleted");
			}
			else
			{
				System.out.println("failure in deletion");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}

}
