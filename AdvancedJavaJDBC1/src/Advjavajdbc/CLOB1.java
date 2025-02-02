package Advjavajdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CLOB1 {
	private static Connection con;
	private static PreparedStatement pstmt;

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_june2024";
		String username="root";
		String password="Vineetha48@";
		
		try 
		{
		   File file=new File("C:\\Users\\vinee\\eclipse-work\\AdvancedJavaJDBC1\\data.txt");
		   FileReader fr=new FileReader(file);
		   
		   //jdbc part
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con=DriverManager.getConnection(url,username,password);
		  
		   String query="update Employee set about=? where EmpId=?";
		   pstmt=con.prepareStatement(query);
		   
		   System.out.println("enter the id:");
		   int id=new Scanner(System.in).nextInt();
		   
		   pstmt.setInt(2, id);
		   pstmt.setCharacterStream(1, fr);
		   
		   int x=pstmt.executeUpdate();
		   System.out.println("update:"+(x==1?"yes":"No"));
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
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
