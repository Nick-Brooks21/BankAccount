<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit Home Page</title>
</head>
<body>
	<h2 align="center"><font color="navy">Deposit</font></h2>
	
	<form action="getDepositServlet" method="post">
	Please enter the amount in your bank account:
	<input type="text" name="balance" size="12">
	</form>
	
	<form action="getDepositServlet" method="post">
	Please enter the amount you wish to deposit:
	<input type="text" name="deposit" size="12">
	<input type="submit" value="Calculate Deposit" />
	</form>

	<a href="index.jsp">Return to Home Page</a>
</body>
</html>