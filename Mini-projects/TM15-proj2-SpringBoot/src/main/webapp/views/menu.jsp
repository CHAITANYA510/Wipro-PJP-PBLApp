<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Project 2</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
	div{
		text-align: center;
	}
</style>
</head>
<body>
	<div>
		<h2>Department Menu</h2>
		<a href="Add.jsp" class="btn btn-primary">Add Department</a>
		<a href="ShowByName.jsp" class="btn btn-primary">Display Department by name</a>
		<a href="DeleteByName.jsp" class="btn btn-primary">Delete Department by name</a>
		<a href="DisplayAllByBudgetGreaterThan.jsp" class="btn btn-primary">Display Departments by budget</a>
		<a href="/displayallOrdered" class="btn btn-primary">Display Departments and order by budget</a>
		<a href="/displayallUnOrdered" class="btn btn-primary">Display Departments in order of entry</a>
	</div>
</body>	
</html>