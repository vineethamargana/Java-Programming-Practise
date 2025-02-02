package Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class CallingOneServFromother extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    	int n1= Integer.parseInt(req.getParameter("num1"));
    	int n2= Integer.parseInt(req.getParameter("num2"));
    	
    	int sum =n1+n2;
    	
//   	it has no use when we use hear while using forward(req,resp).while doing with forward see the result by comenting and uncomenting it 
    	PrintWriter pw = resp.getWriter();
    	pw.println(sum);  
    	
    	req.setAttribute("sum", sum); // doesnot require when we use inclue(req,resp)
    	RequestDispatcher rd=req.getRequestDispatcher("/servlet2");
    	//rd.forward(req, resp);
    	rd.include(req, resp);
    	
    }
}




