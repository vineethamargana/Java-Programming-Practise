package Advjavajdbc;
import java.sql.Connection;
import java.sql.Statement;

public class program2 {
	public static void main(String[] args)  {
		Connection con=null;
		Statement stmt=null;
		String q="insert into employee(empid,empname,dpt,salary) values (6,'rocky','finance',30000)";
		try {
			con=MyConnect.connect();
			stmt=con.createStatement();
//			stmt.executeQuery(q);
			int x=stmt.executeUpdate(q);
			System.out.println("output is "+x);
		}
		 catch (Exception e) {
				e.printStackTrace();
		}
		finally {
			MyConnect.close(null, stmt, con);
		}
	}

}
