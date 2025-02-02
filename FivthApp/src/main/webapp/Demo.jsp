<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator Page</title>
</head>
<body>
   <!-- declaration -->
   <%!
      int add()
      {
	   int a=20,b=30;
	   return a+b;
      }
      int sub()
      {
	   int a=50,b=20;
	   return a-b;
      }
      int mul()
      {
	   int a=20,b=30;
	   return a*b;
      }
      int div()
      {
	   int a=30,b=3;
	   return a/b;
      }  
   %>
   
   <!--  -->
   <%
     String res="mul";
    if(res.equals("add"))
    {
      %><h1 style="color:red"><%out.println(add()); %></h1>
    <% }
    else if(res.equals("sub"))
    {
    	%><h2><%out.println(sub()); %></h2>
    <% }
    else if(res.equals("mul"))
    {
    	%><h3><%out.println(mul()); %></h3>
   <% }
    else
    {
     %><h4><%out.println(div());  %></h4>
   <% }
    %> 
     
</body>
</html>
<style>
  h2{
  color:blue;
  }
  h3{
  color:green;
  }
  
</style>