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
 * Servlet implementation class ModifyUser
 */

@WebServlet("/modifyUser")
public class ModifyUser extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phonenumber = req.getParameter("phonenumber");
		// String password = req.getParameter("password");
		String address = req.getParameter("address");
		
		User u = new User(id, name, email, phonenumber, null , address);
		UserDAO userDAO = new UserDAOImpl();
		int status = userDAO.modifyUser(u);
		
		if(status ==0)
		{
			resp.sendRedirect("failure.jsp");
		}
		else
		{
			resp.sendRedirect("success.jsp");
		}
	}
}
