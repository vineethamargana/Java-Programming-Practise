package com.tap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAO.UserDAO;
import com.tap.DAOImpl.UserDAOImpl;
import com.tap.model.User;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/addUser")
public class AddUser extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phonenumber = req.getParameter("phonenumber");
		String password = req.getParameter("password");
		String address = req.getParameter("address");

	   User user= new User(name, email, phonenumber, password, address);
	   
	   UserDAO userDAO =new UserDAOImpl();
	 //  userDAO.addUser(user);
	   int status= userDAO.addUser(user);
	   if(status==0)
	   {
		   resp.sendRedirect("failure.jsp");
	   }
	   else
	   {
		   resp.sendRedirect("fetchdata");
	   }
		
	}
}
