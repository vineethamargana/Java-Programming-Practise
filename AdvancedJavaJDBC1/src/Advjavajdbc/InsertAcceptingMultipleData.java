package Advjavajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertAcceptingMultipleData {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int empid,salary;
		String empname,dpt,ch;
		String url="jdbc:mysql://localhost:3306/jdbc_june2024";
		String username="root";
		String password="Vineetha48@";
		Connection con=null;
		PreparedStatement pstmt;
		
		String sql="insert into `Employee`(`empid`,`empname`,`dpt`,`salary`) values(?,?,?,?)";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			
			pstmt=con.prepareStatement(sql);
			
		for(;;)
		{
			System.out.println("enter the empid");
			empid=sc1.nextInt();
			System.out.println("enter the empname");
			empname=sc2.nextLine();
			System.out.println("enter the dpt");
			dpt=sc2.nextLine();
			System.out.println("enter the salary");
			salary=sc1.nextInt();
			
			pstmt.setInt(1, empid);
			pstmt.setString(2, empname);
			pstmt.setString(3, dpt);
			pstmt.setInt(4, salary);
			
			//pstmt.executeUpdate();
			pstmt.addBatch();
			
			System.out.println("do you ant to insert more data:(y/n)");
			ch=sc2.next();
			if(ch.equals("n"))
			{
				break;
			}
		}	
		   int ar[]= pstmt.executeBatch();	
		   for(int x:ar)
		   {
			  System.out.println(x);
		   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
