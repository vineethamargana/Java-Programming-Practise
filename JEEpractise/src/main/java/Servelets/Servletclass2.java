package Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/servlet2")
public class Servletclass2  extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    	int n1= Integer.parseInt(req.getParameter("num1"));
    	int n2= Integer.parseInt(req.getParameter("num2"));
    	
    	int p = n1*n2;
    //	int sum1 = (int)req.getAttribute("sum"); // doesnot require when we use inclue(req,resp)
                                                 //sum in the bracket is the first value in the setAttriute method and the output of getAttribute is the object so we have to change it to int.
    	PrintWriter pw = resp.getWriter();
    	//pw.println(sum1);
    	pw.print(p);
    
    	
    }
}