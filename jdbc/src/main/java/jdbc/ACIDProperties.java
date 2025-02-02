package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ACIDProperties {
	private static String sq = "update transaction set balance=balance-? where id=?";
	private static String rq = "update transaction set balance=balance+? where id=?"; //we should not use `` these for question marks.
	private static int pin=121212;
	public static void main(String[] args) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Vineetha48@");
			Scanner sc=new Scanner(System.in);
			con.setAutoCommit(false);
			
			System.out.println("enter the sender id");
			int sid=sc.nextInt();
			System.out.println("enter the amount to send");
			int amount=sc.nextInt();
			//System.out.println(amount);
			
			PreparedStatement pstmt_1 = con.prepareStatement(sq);
			pstmt_1.setInt(1,amount);
			pstmt_1.setInt(2,sid);
			int n1=pstmt_1.executeUpdate();
			
			System.out.println("enter the receiver id");
			int rid=sc.nextInt();
			
			PreparedStatement pstmt_2 = con.prepareStatement(rq);
			pstmt_2.setFloat(1,amount);
			pstmt_2.setInt(2,rid);
			int n2=pstmt_2.executeUpdate();
			
			
			System.out.println("enter the pin");
			if(pin==sc.nextInt() && n1==1 && n2==1)
			{
				con.commit();
				System.out.println("success");
			}
			else
			{
				con.rollback();
				System.out.println("f");
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
