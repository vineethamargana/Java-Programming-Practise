package Advjavajdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class StoredProcedure {
	
	private static Connection con;
	private static CallableStatement prepCall;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_june2024","root","Vineetha48@");
			
			//calling existing procedure.
			//get the count based on department.
			prepCall=con.prepareCall("{call emp_count_on_dept(?,?)}");
			System.out.print("enter the dept name:");
			String dept=sc.next();
			prepCall.setString(1, dept);
			prepCall.registerOutParameter(2, Types.INTEGER);
			prepCall.execute();
			int x=prepCall.getInt(2);
			System.out.println("No of employees in "+dept+" department are : "+x);
			
			
			//get the count based on salary
			prepCall=con.prepareCall("{call emp_on_salary30000(?,?)}");
			System.out.print("enter the salary:");
			String salary=sc.next();
			prepCall.setString(1, salary);
			prepCall.registerOutParameter(2, Types.INTEGER);
			prepCall.execute();
			x=prepCall.getInt(2);
			System.out.println("No of employees more than "+salary+" are : "+x);
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
