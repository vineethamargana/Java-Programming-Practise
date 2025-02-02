package com.tap.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tap.DAO.UserDAO;
import com.tap.DAOImpl.UserDAOImpl;
import com.tap.model.User;

/**
 * Servlet implementation class FetchData
 */

@WebServlet("/fetchdata")
public class FetchData extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		 UserDAO userDAO = new UserDAOImpl();
		 ArrayList<User> userList = userDAO.getAallUSers();
		 
		 HttpSession session = req.getSession();
		 session.setAttribute("userList", userList);
		 
		 resp.sendRedirect("home.jsp");
	}

}
