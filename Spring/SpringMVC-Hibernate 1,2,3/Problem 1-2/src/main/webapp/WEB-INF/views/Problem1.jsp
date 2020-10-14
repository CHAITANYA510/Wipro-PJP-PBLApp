<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC with Hibernate</title>
<style>
	div{
		text-align: center;
	}
	table,th,td{
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
	<div>
		<h1>Problem 1</h1>
		<h1>Enter student data</h1>
		<form:form action="PostInsert" method="post" modelAttribute="student">
		<table>
			<tr>
				<td>Enter regNo</td>
			 	<td><form:input path="regNo" /></td>
			</tr>	
			<tr>
				<td>Enter name</td>
			 	<td><form:input path="name" /></td>
			</tr>	
			<tr>
				<td>Enter fees</td>
			 	<td><form:input path="fees" /></td>
			</tr>	
			<tr>
				<td colspan="2">	
					<input type="submit" value="Add Student">
					<input type="reset">
				</td>
			</tr>	
		</table>
		</form:form>
	</div>
</body>
</html>