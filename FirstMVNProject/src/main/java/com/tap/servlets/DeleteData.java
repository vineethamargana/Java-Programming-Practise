package com.tap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.DAO.UserDAO;
import com.tap.DAOImpl.UserDAOImpl;

/**
 * Servlet implementation class DeleteData
 */

@WebServlet("/deleteData")
public class DeleteData extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		UserDAO userDAO = new UserDAOImpl();
		int status = userDAO.deleteData(Integer.parseInt(req.getParameter("userId")));
		if (status == 0) {
			resp.sendRedirect("failure.jsp");
		} else {
			resp.sendRedirect("fetchdata");
		}
	}

}
