//check if the sending money is greater than the total money in the account
package Advjavajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ACIDproperties {
   
	private static String url="jdbc:mysql://localhost/jdbc_june2024";
    private static String username="root";
    private static String password="Vineetha48@";
    static Connection con=null;
    static int pin=121212;
    static Scanner sc=new Scanner(System.in);
	private static PreparedStatement pstmt_s;
	private static PreparedStatement pstmt_r;
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);	
			con.setAutoCommit(false);//imp to protect the money while server is down.
			String sendQuery="update BANK set balance=balance-? where u_id=?";
			String recQuery="update BANK set balance=balance+? where u_id=?";
			
			pstmt_s = con.prepareStatement(sendQuery);
			pstmt_r = con.prepareStatement(recQuery);
			System.out.print("enter the sender UID:");
			int suid=sc.nextInt();
			System.out.print("enter the amount to send:");
			int amount=sc.nextInt();
			
			pstmt_s.setInt(1,amount);
			pstmt_s.setInt(2,suid);
			int n1=pstmt_s.executeUpdate();
		//	System.out.println("sending money: "+n1 );
			
			System.out.print("enter the receiver UID:");
			int ruid=sc.nextInt();
			pstmt_r.setInt(1,amount);
			pstmt_r.setInt(2,ruid);
		    int n2=pstmt_r.executeUpdate();
		//	System.out.println("receiving money: "+n2 );
			
			System.out.println("enter pin");
			//int enteredPin=sc.nextInt();
			if(pin==sc.nextInt() && n1==1 && n2==1 ) //n1==1 && n2==1 is given because if we didnot give it and if we send the money to the receiver who doesnot even exist then the receiving money will be failure but sending money will be success...then if we enter the correct upi pin then the output changes which should not be changed.i.e the sender money will be cut and the receiver didnot receive it==inconsistency 
			{
				con.commit();
				System.out.println("success");
			}
			else
			{
				con.rollback();
				System.out.println("failure");
			}
		} 
		catch (Exception e)
		{
	       e.printStackTrace();
		}
	}

}
