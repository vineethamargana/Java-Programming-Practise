package com.tap.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
   @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	   try 
	   {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jee123","root","Vineetha48@");
		    
		    String email=req.getParameter("email");
		    String password=req.getParameter("password");
		    
		    PreparedStatement pstmt= con.prepareStatement("select * from user where email=?");
		    pstmt.setString(1, email);
		    ResultSet res=pstmt.executeQuery();
		    
		    if(res.next())
		    {
		    	if(res.getString("password").equals(password))
		    	{
		    		//System.out.print("hii");
		    		String name = res.getString("name");
		    		email = res.getString("email");
		    		String phonenumber = res.getString("phonenumber");
		    		String address = res.getString("address");
		    		
		    		req.setAttribute("name",name);
		    		
		    		HttpSession session = req.getSession();
		    		session.setAttribute("name",name);
		    		session.setAttribute("email",email);
		    		session.setAttribute("phonenumber",phonenumber);
		    		session.setAttribute("address",address);
	
		    		req.getRequestDispatcher("demo.jsp").forward(req, resp);
		    		
		    	//	resp.sendRedirect("home.jsp");
		    	}
		    	else
		    	{
		    		resp.sendRedirect("invalidPassword.jsp");
		    	}
		    }
		    else
		    {
		    	resp.sendRedirect("noUserFound.jsp");
		    }


	   }
	   catch (Exception e) 
	   {
		 e.printStackTrace();
	   }
	
   }
}
