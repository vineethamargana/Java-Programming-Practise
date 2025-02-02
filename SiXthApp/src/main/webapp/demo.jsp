<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DEMO PAGE</title>
</head>
<body>
   <%
   int n= Integer.parseInt(request.getParameter("num"));
	  
   for(int i=1;i<=n;i++)
   {
	  for(int j=1;j<=n;j++)
	  {
		  out.print("*");
	  }
	 %><br><% 
   }
   response.sendRedirect("");
   %>
   
</body>
</html>