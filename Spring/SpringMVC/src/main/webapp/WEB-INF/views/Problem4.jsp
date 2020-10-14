<%@ page language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Problem 4</title>
<style>
	table{
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
<div style="text-align:center;">
	<h1>Problem 4</h1>
	<h2>List of top movies</h2>
	<table>
		<c:forEach var="movie" items="${movieList}">
		    <tr>
             	<td>${movie}</td>
            </tr>
		</c:forEach>
	</table>
</div>	
</body>
</html>