package Advjavajdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteAcceptingData {
	private static Statement stmt;
	private static PreparedStatement pstmt;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String sql="delete from `Employee` where `empid`=?";
		Connection con=null;
		try 
		{
			con=MyConnect.connect();
			pstmt=con.prepareStatement(sql);
			System.out.println("enter the EmployeeId to be deleted ");
			//int id=sc.nextInt();
			pstmt.setInt(1,sc.nextInt() );
			System.out.println(pstmt.executeUpdate());
			
			
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
