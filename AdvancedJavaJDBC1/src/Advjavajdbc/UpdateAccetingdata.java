package Advjavajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateAccetingdata {
	private static Connection con;
	private static PreparedStatement pstmt;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/jdbc_june2024";
		String username="root";
		String password="Vineetha48@";
		
		System.out.println("enter the department");
		String dept=sc.next();
		System.out.println("enter salary to be incremented");
		int inc=sc.nextInt();
		try {
			//1.loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(url,username,password);
			
			//2.establish conectionto database
			con=DriverManager.getConnection( url,username,password);
			
			//3.create sql statement
			String sql="update `employee` set `salary`=`salary` +?  where `dpt`=?";
			pstmt =con.prepareStatement(sql);
			
			pstmt.setInt(1, inc);
			pstmt.setString(2, dept);
			
			System.out.println(pstmt.executeUpdate());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		  MyConnect.close(null, pstmt, con);
	   }
	}


}
