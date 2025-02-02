package jdbc;

import java.sql.DriverManager;

public class Intro1 {
   public static void main(String[] args) {
//	   try {
//		   Class.forName("com.mysql.cj.jdbc.Driver");
//	       System.out.println("Driver is loaded");
//	   }
//	   catch(ClassNotFoundException e){
//		   e.printStackTrace();
//	   }
	   DriverManager.getConnection();
}
}
