/*
  META DATA: data about the table. i.e coloumns ,column names,coloumn data types etc.
 */

package Advjavajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class METADATA{
	private static final String URL="jdbc:mysql://localhost:3306/university";
	private static final String USERNAME="root";
	private static final String PASSWORD="Vineetha48@";
	private static final String QUERY="select * from course";
	
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet result=null;
	private static ResultSetMetaData rsmd=null;
	
	public static void main(String[] args) {
		try 
		{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			 stmt=con.createStatement();
			 result=stmt.executeQuery(QUERY);
			 rsmd=result.getMetaData();
			 int x=rsmd.getColumnCount();
			 System.out.println("no of coloums are:"+x); 
			 for(int i=1;i<=x;i++)
			 {
				System.out.println("coloumn no:"+i+""
						+ "\n\tColumn Name: "+rsmd.getColumnName(i) 
				        +"\n\tcolumn data type: "+rsmd.getColumnTypeName (i)
			 	        +"\n\tIs column nullable: "+(rsmd.isNullable(i)==1?"yes":"no")
				        +"\n\tis it auto increment: " +(rsmd.isAutoIncrement(i)?"yes":"no")+"\n\n"      
				); 
			 }
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	} 

}
