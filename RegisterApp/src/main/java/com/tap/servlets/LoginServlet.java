/*
   COOKIES:
   -----------
   -----------
 */

package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	String url="jdbc:mysql://localhost:3306/jee123";
	String username="root";
	String pwd="Vineetha48@";
    private PrintWriter pw;
    private Connection connection;
    private PreparedStatement pstmt;
	private ResultSet res;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  pw = resp.getWriter();
    	  System.out.println("received control");
    	  String email=req.getParameter("email");
		  String password=req.getParameter("password");
		  System.out.println(email+password);

    	try 
	    {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url,username,pwd);
			
			String sql="select * from `user` where `email` =? and `password` =?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1,email);
			pstmt.setString(2,password);
			
			res=pstmt.executeQuery();
			System.out.println(res);
			if(res.next())
			{
				String name = res.getString("name");
				email= res.getString("email");
				String phoneNumber = res.getString("phoneNumber");
				String address = res.getString("address");
                password = res.getString("password");
				
                Cookie c1= new Cookie("name",name);
				Cookie c2= new Cookie("email",email);
				Cookie c3= new Cookie("phoneNumber",phoneNumber);
				Cookie c4= new Cookie("password",password);
				
				c1.setMaxAge(40);
				c2.setMaxAge(50);
				c3.setMaxAge(60);
				c4.setMaxAge(70);

				pw.println("welcome to my first JEE app");
				resp.addCookie(c1);
				resp.addCookie(c2);
				resp.addCookie(c3);
				resp.addCookie(c4);
				
			//	pw.println("hello "+name );
				resp.sendRedirect("loginsuccess.html");
				
			}
			else
			{
				resp.sendRedirect("loginfailure.html");
				//pw.println("Invalid credintials");

			}
		} 
	    catch (Exception e) 
	    {
			e.printStackTrace();
		}
	
    }
}
