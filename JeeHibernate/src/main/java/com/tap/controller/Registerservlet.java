package com.tap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAOImpl.StudentDAOImpl;
import com.tap.entity.Student;

/**
 * Servlet implementation class Registerservlet
 */

@WebServlet("/register")
public class Registerservlet extends HttpServlet {
	
	int status;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String password=req.getParameter("password");
    	String cpassword=req.getParameter("cpassword");
        if(password.equals(cpassword)) 
        {
        	String name=req.getParameter("name");
        	String email=req.getParameter("email");
        	String mobile=req.getParameter("mobile");
        	String address=req.getParameter("address");
        	Student s = new Student(name,email,mobile,address,password);
        	StudentDAOImpl sdaoi = new StudentDAOImpl();
        	status = sdaoi.register(s);
        	if(status != 0)
        	{
        		resp.sendRedirect("success.html");
        	}
        	else
        	{
        		resp.sendRedirect("failureregister.html");
        	}
        }
        else
        {
        	resp.sendRedirect("failure.html");
        }
    }
}
