<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You're  Account</title>
</head>
<body>
<h1>Account Holder Name : </h1> <%=request.getAttribute("name") %>
<h1>Balance : </h1><%=request.getAttribute("balance") %>
</body>
</html>