/*
  Accepting and inserting 
  we used prepared statement which is used while query is incomplete and we dont have the 
  values and we should take the values from the user.
 */
package Advjavajdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertAcceptingData {
  public static void main(String[] args) {
	  Scanner sc1=new Scanner(System.in);//for scanning integer data
	  Scanner sc2=new Scanner(System.in);//for scanning string data
	  int id,salary;
	  String name,dept;
	  
	Connection con=null;
	PreparedStatement pstmt=null;
	String q="insert into employee(empid,empname,dpt,salary)"+" values (?,?,?,?)";
	System.out.println("enter the id");
	id=sc1.nextInt();
	System.out.println("enter the name");
	name=sc2.nextLine();
	System.out.println("enter the dept");
	dept=sc2.nextLine();
	System.out.println("enter the salary");
	salary=sc1.nextInt();

	try {
		con=MyConnect.connect();
		pstmt=con.prepareStatement(q);
				
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(4, salary);
		pstmt.setString(3, dept);
		
		int x=pstmt.executeUpdate();
		System.out.println("output is "+x);
		
	} 
	catch (ClassNotFoundException | SQLException e) 
	{
		e.printStackTrace();
	} 
}
}
