package com.tap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formServlet")
public class FormServlet extends HttpServlet
{
	int a=100,b=200;
	int add()
	{
		return a+b;
	}
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	//System.out.println("control at servlet");
    	
    	PrintWriter pw = resp.getWriter();
    	int res=add();
    	pw.println(res);
    	
    }
}
