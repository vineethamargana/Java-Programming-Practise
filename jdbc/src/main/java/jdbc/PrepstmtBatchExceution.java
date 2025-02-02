package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepstmtBatchExceution {
	private static String query ="insert into employee(id,name,designation,salary) values (?,?,?,?)";
	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Vineetha48@");
			
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			
			System.out.print("enter the number of records to be inserted");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println("enter the details:");
				pstmt.setInt(1, sc.nextInt());
				pstmt.setString(2, sc.next());
				pstmt.setString(3, sc.next());
				pstmt.setFloat(4, sc.nextFloat());
				
				pstmt.addBatch();
				
			}
			
			int res[] = pstmt.executeBatch();
		    for (int i = 0; i < res.length; i++)
		    {
				System.out.println(res[i]+" ");
			}
		    
		    Statement stmt=con.createStatement();
		    String query = "select * from employee";
			ResultSet res1 = stmt.executeQuery(query);
			//System.out.println(res);
			while(res1.next()== true) 
			{
				System.out.println(res1.getInt(1)+" "+res1.getString(2)+" "+res1.getString(3)+" "+res1.getFloat(4));
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
