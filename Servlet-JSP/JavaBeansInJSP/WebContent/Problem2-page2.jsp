<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Problem 2</title>
</head>
<body>	
	<h1>2nd JSP page</h1>
	<h1>Number entered is <%= request.getParameter("number") %></h1>
</body>
</html>