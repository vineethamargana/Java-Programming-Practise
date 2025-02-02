package com.tap.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Displaydata extends HttpServlet
{
   private PrintWriter pw;

@Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	   String username=req.getParameter("username"); //un=username
	   System.out.println(username); //it will be printed on console
	   
	   pw= resp.getWriter();
	   pw.println("Welome "+username); //it will be printled on the browser
   }
	
}
