//prepare statement to execute single sql statement

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Prepstmt {
	private static String query ="insert into employee(id,name,designation,salary) values (?,?,?,?)";
	private static String q1 ="update employee set salary=5500 where id=?";
	private static String q5="delete from employee where id=?";

	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Vineetha48@");
			System.out.println("connection");
//			
//			PreparedStatement pstmt = con.prepareStatement(query);
//			Scanner sc = new Scanner(System.in);
//			
//			pstmt.setInt(1, sc.nextInt());
//			pstmt.setString(2, sc.next());
//			pstmt.setString(3, sc.next());
//          pstmt.setFloat(4, sc.nextFloat());
            
			PreparedStatement pstmt = con.prepareStatement(q5);
       		Scanner sc = new Scanner(System.in);
       		pstmt.setInt(1, sc.nextInt());
            int res=pstmt.executeUpdate();
            if(res==1)
            {
            	System.out.println("success");
            }
            else
            {
            	System.out.println("failure");
            }
  
            Statement stmt = con.createStatement();
            ResultSet ress=stmt.executeQuery("select * from employee");
            while(ress.next()== true)
            {
            	System.out.println(ress.getInt("id")+" "+ress.getString("name")+" "+ress.getString("designation")+" "+ress.getFloat("salary"));
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
