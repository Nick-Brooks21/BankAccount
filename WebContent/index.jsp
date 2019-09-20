<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Account</title>
</head>
<body>
	<h3 align="center">Welcome to your bank account! Select an option below to get started</h3>
	<table>
		<tr>
			<td>
				<form action="deposit.jsp" method="post">
				<input type="submit" value="Make a Deposit" />
				</form>
			</td>	
			<td>
				<form action="withdraw.jsp" method="post">
				<input type="submit" value="Make a Withdraw" />
				</form>
			</td>
		</tr>
	</table>
</body>
</html>