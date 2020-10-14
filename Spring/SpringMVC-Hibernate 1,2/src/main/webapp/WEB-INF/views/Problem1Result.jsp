<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC with Hibernate</title>
<style>
	div{
		text-align: center;
	}
</style>
</head>
<body>
	<div>
		<p>${message1}</p>
		<p>${message2}</p>
		<p style="text-align: center;"><a href="index.jsp">Click here to return to main menu</a></p>
		<p style="text-align: center;"><a href="PreInsert">Click here to add Student</a></p>
		<p style="text-align: center;"><a href="ViewStudents">Click here view Students</a></p>
	</div>
</body>
</html>