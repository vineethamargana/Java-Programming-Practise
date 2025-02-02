<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <% 
      String name = (String) request.getAttribute("name");
      String email = ( String) session.getAttribute("email");
      String phonenumber = (String) session.getAttribute("phonenumber"); 
      String address = (String) session.getAttribute("address");

  %>

   <h1>Welcome ${name}</h1>

   <p>Your Profile Details Are As Follows</p>
      Email: ${email }<br>
      Phone Number: ${phonenumber} <br> 
      Address: ${address} <br>
</body>
</html>