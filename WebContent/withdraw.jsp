<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw Home Page</title>
</head>
<body>
	<h2 align="center"><font color="navy">Withdraw</font></h2>
	
	<form action="getWithdrawServlet" method="post">
	Please enter the amount in your bank account:
	<input type="text" name="balance" size="20">
	</form>
	
	<form action="getWithdrawServlet" method="post">
	Please enter the amount you wish to withdraw:
	<input type="text" name="withdraw" size="20">
	<input type="submit" value="Calculate Withdraw" />
	</form>

	<a href="index.jsp">Return to Home Page</a>
</body>
</html>