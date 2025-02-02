package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExplaination {
	//these are also working
//	private static String q1="insert into employee(id,name,designation,salary) values(4,'anand','faculty',4300)";
//	private static String q2="insert into employee(id,name,designation,salary) values(5,'colum','faculty',4300)";
//	private static String q3="insert into employee(id,name,designation,salary) values(6,'babi','junior lecturer',4300)";
	
	private static String q1 ="update employee set salary=5500 where id=4";
	private static String q2 ="update employee set designation='staff' where id=5";
	private static String q3 ="update employee set salary=6555 where id=6";
	
	private static String q4="insert into employee(id,name,designation,salary) values(10,'nake','ourity',9800)";
	private static String q5="delete from employee where id=4";

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Vineetha48@");
			
			//creating sql statement
			Statement stmt = con.createStatement();
			
			//adding sql statement batch
			stmt.addBatch(q1);
			stmt.addBatch(q2);
			stmt.addBatch(q3);
			stmt.addBatch(q4);
			stmt.addBatch(q5);
			
			//executing to batch
			int res[]=stmt.executeBatch();
			System.out.println(res[2]);
			
			
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
