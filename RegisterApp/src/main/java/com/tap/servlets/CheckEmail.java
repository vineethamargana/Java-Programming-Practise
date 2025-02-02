package com.tap.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sendData")
public class CheckEmail extends HttpServlet
{
	@Override
	public void init() throws ServletException {
		System.out.println("init() method in check email");
	}
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   	 
    	 System.out.println("service() in checkemail servlet");

        String email= req.getParameter("email");
    	String name=req.getParameter("name");
    	String phoneNumber= req.getParameter("phoneNumber");
    	String password=req.getParameter("password");
    	String cpassword= req.getParameter("cpassword");
    	String address=req.getParameter("address");
    	
    	
    	if(email.length()>=10)
    	{
    		//request dispatcher servlet chaining
//    		resp.getWriter().println("Email checked");
//    		RequestDispatcher rd= req.getRequestDispatcher("/register");
//    		rd.forward(req, resp);
    		
    		//send redirect servlet chaining
    		HttpSession session=req.getSession();
    		session.setAttribute("name", name);
    		session.setAttribute("email", email);
    		session.setAttribute("phoneNumber", phoneNumber);
    		session.setAttribute("password", password);
    		session.setAttribute("cpassword", cpassword);
    		session.setAttribute("address", address);

    		
    		resp.sendRedirect("register");
    		
    	}
    	else
    	{
    		//resp.getWriter().println(name+" please enter valid Email ");
    		resp.sendRedirect("invalidemail.html");
    	}
    }
     @Override
    public void destroy() {
    	System.out.println("Destroy() in checkEmail");
    	//anything that is initialised can be destroy here.
    }
}
