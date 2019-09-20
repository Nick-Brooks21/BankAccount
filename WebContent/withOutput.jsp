<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Withdraw Statement</title>
</head>
<body>
	<p>
	Your new balance is: $${bankAccount.getBalance() - bankAccount.getWithdraw()} 
	</p> 
	
	<br>
	<br>
	<a href="index.jsp">Return to Home Page</a>
</body>
</html>