<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.tap.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Welcome to CRUD PROJECT</h1>
		<a href="adduser.jsp"><button>Add User</button></a> <br> <br>

		<% ArrayList<User> userList = (ArrayList)session.getAttribute("userList"); %>

		<table border="5px solid">
			<%for(User user :  userList) 
		{
		%>
			<tr>
				<td><% out.println(user.getId()); %></td>
				<td><% out.println(user.getName()); %></td>
				<td><% out.println(user.getEmail()); %></td>
				<td><% out.println(user.getPhonenumber()); %></td>
				<td><% out.println(user.getPassword()); %></td>
				<td><% out.println(user.getAddress()); %></td>
				<td><a href="deleteData? userId=<%= user.getId() %>">Delete</a> |
				<a href= "modify.jsp ? id=<%= user.getId()%>,name = <%= user.getName()%>,
				email = <%= user.getEmail() %> ,phonenumber = <%= user.getPhonenumber() %>,address = <%= user.getAddress() %>"> Modify</a></td>
			</tr>
	   <% } %>
		</table>
	</center>
</body>
</html>