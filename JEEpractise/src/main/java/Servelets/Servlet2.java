package Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class Servlet2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("username"); //it doesnot get the value when we use send redirect
		
       
//		String name= (String) req.getAttribute("name"); // it also doesnot get the value with send redirect
      PrintWriter pw= resp.getWriter();
       pw.print("username"+name);
	}
}
