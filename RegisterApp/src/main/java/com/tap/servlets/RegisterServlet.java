package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	String url="jdbc:mysql://localhost:3306/jee123";
	String username="root";
	String pwd="Vineetha48@";
  private PrintWriter pw;
  private Connection connection;
  private PreparedStatement pstmt;
  @Override
public void init() throws ServletException {
	System.out.println("init() in register servlet");
}
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  System.out.println("service() in register servlet");
	   HttpSession session=req.getSession();
	   String name=(String) session.getAttribute("name");
	   String email=(String) session.getAttribute("email");
	   String password=(String) session.getAttribute("password");
	   String cpassword=(String) session.getAttribute("cpassword");
	   String address=(String) session.getAttribute("address");
	   String phoneNumber1=(String) session.getAttribute("phoneNumber");
       Long phoneNumber = Long.parseLong(phoneNumber1);
	  
    //   System.out.println("output from register: " +name+" "+email+" "+phoneNumber+" "+password+" "+cpassword+" "+address);

  
  
	
	  pw=resp.getWriter();
	  String sql="insert into `user` (`name`,`email`,`phonenumber`,`password`,`address`)"+"values(?,?,?,?,?) ";
	  
	  
 try 
   {
		 
    if(password.equals(cpassword))
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    connection =DriverManager.getConnection(url,username,pwd);
	    pstmt=connection.prepareStatement(sql);
	  
	  pstmt.setString(1, name);
	  pstmt.setString(2, email);
	  pstmt.setString(4, password);
	  pstmt.setString(5, address );
	  pstmt.setLong(3, phoneNumber);
	  
	  
	  int x=pstmt.executeUpdate(); 	  
      if(x!=0)
      {
    	//  pw.println(name+" has registered");
    	  resp.sendRedirect("successregister.html");
      }
      else
      {
    	 // pw.println(name+" was not registered");
    	  resp.sendRedirect("failureregister.html");
      }
	 }
      else
      {
    	// pw.println(name+" password and cpassword doesnot match ! please try again"); 
    	  resp.sendRedirect("invalidpwd.html");
      }
   // System.out.println(name+" "+email+" "+phoneNumber+" "+password+" "+cpassword+" "+address);
   } 
   catch (Exception e) 
	{
	   pw.println("some Exception");
		e.printStackTrace();
	}
   } 
  @Override
  public void destroy() {
	System.out.println("Destroy() in registerServlet");
  }
}

