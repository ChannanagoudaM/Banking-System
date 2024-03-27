<%@page import="com.example.BankingSystem.entities.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <table border="1">
        <tbody>
        <tr>
        <td>
        <%=request.getAttribute("Id") %>
        <%=request.getAttribute("AccountHolderName") %>
        <%=request.getAttribute("Balance") %>
        </td>
        </tr>
    </table>
</body>
</html>