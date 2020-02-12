<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="LoginController" method="POST">
	
	USERNAME:
	<input type="text" name="usrname" id="" required="required"><br>
	
	PASSWORD:
	<input type="password" name="password" id="password" required="required"><br><br>
	
	<input type="submit" value="Login">
	
	
	
	</form>

</body>
</html>