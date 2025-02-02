<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify Page</title>
</head>
<body>
	<h2>This is modify Page</h2>
	<form action="modifyUser ? id=<%request.getParameter("id");%>">
		<table>
			<tr>
				<td>User Id:</td>
				<td><input type="text" name="id"
					value=" <%out.println(request.getParameter("id"));%> " disabled>
					<input type="text" name="id"
					value=" <%out.println(request.getParameter("id"));%> " hidden ></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"
					value=" <%out.println(request.getParameter("name"));%> "></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"
					value=" <%out.println(request.getParameter("email"));%> "></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="number" name="phonenumber"
					value=" <%out.println(request.getParameter("phonenumber"));%> "></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address"
					value=" <%out.println(request.getParameter("address"));%> "></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update user"></td>
			</tr>
		</table>
	</form>
</body>
</html>