<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
</head>
<body>

<form action="create">
<h1>Please Fill Bellow Form To Create You're Account</h1>
<input type="text" name="accountHolderName" placeholder="Enter Youre Name">
<br><br>
<input type="text" name="balance" placeholder="Enter Youre Balance">
<br><br>
<input type="submit">
</form>


<form action="get">
<h1>Please Enter You're Id to Get You're Account</h1>
<input type="text" name="id" placeholder="Enter you're Id">
<input type="submit">
</form>


<form action="remove">
<h1>Please Enter You're Id to Remove You're Account</h1>
<input type="text" name="id" placeholder="Enter you're Id">
<input type="submit">
</form>


<form action="removeByName">
<h1>Please Enter You're Name to Remove You're Account</h1>
<input type="text" name="AccountHolderName" placeholder="Enter you're Name">
<input type="submit">
</form>

<form action="displayAll">
<h1>To Get EveryOne's Details</h1>
<input type="submit">
</form>

</body>
</html>