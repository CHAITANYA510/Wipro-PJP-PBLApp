<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Project 1</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
	div{
		text-align: center;
	}
</style>
</head>
<body>
	<div>
		<h2>Department menu</h2>
		<a href="Add.jsp" class="btn btn-primary">Add Department</a>
		<a href="Delete.jsp" class="btn btn-primary">Delete Department</a>
		<a href="Update.jsp" class="btn btn-primary">Update Department</a>
		<a href="Display.jsp" class="btn btn-primary">Display Department</a>
		<a href="/displayAll" class="btn btn-primary">Display All Department</a>
	</div>
</body>	
</html>