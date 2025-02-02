<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <center>
          <h1>This is demo.jsp Page</h1>
          
           ${sessionScope.name}<br>
           ${sessionScope.email}<br>
           ${sessionScope.phonenumber}<br>
           ${sessionScope.address}<br>
           
          
     </center>
</body>
</html>