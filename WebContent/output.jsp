<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output</title>
</head>
<body>
	<p>
	${bankAccount.getNewBalance()} Your new balance is: $ <br />
	</p> 
	<a href="index.jsp">Return to Home Page</a>
</body>
</html>