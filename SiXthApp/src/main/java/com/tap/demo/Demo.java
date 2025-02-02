package com.tap.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Demo extends HttpServlet
{
   @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   PrintWriter pw=resp.getWriter();
	   int n= Integer.parseInt(req.getParameter("num"));
	  
	   for(int i=1;i<=n;i++)
	   {
		  for(int j=1;j<=n;j++)
		  {
			  pw.print("*");
		  }
		  pw.println();
	   }
   }
}
