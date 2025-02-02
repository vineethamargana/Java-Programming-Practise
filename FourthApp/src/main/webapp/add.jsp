<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DISPLAY - PAGE </title>
</head> 
<body>
   <!-- DECLARATION PART -->
   <%!
    int a=100,b=200;
	int add()
	{
		return a+b;
	}
   %>
   
   <!-- MAIN LOGIC -->
   <%
    
	out.println(add());
   %>
</body>
</html>