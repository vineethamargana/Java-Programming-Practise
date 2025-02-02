package com.tap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	String url="jdbc:mysql://localhost:3306/jee123";
	String username="root";
	String pwd="Vineetha48@";
	private Connection connection;
	private PreparedStatement pstmt;
	private PrintWriter pw;
  
	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
//    	PrintWriter printWriter=resp.getWriter();
//    	printWriter.println("username : "+un+" Password :"+pwd);
    	
    	String sql="select * from user where email=? and password=?";
    	String un=req.getParameter("un");
    	String pwd=req.getParameter("pwd");
    	try {
    	 if(sql.isEmpty()==false)
    		{
    			Class.forName("com.mysql.cj.jdbc.Driver");
    		    connection =DriverManager.getConnection(url,username,pwd);
    		    pstmt=connection.prepareStatement(sql);
    		  
    		  
    		  int x=pstmt.executeUpdate(); 	  
    	      if(x==1)
    	      {
    	    	  pw.println("Data Inserted Successfully");
    	      }
    	      else
    	      {
    	    	  pw.println("Failure");
    	      }
    		 }
    	      else
    	      {
    	    	 pw.println("password and cpassword doesnot match"); 
    	      }
    	   } 
    	   catch (Exception e) 
    		{
    		   pw.println("some Exception");
    			e.printStackTrace();
    		}
    		  
    	  }
    	
    }

