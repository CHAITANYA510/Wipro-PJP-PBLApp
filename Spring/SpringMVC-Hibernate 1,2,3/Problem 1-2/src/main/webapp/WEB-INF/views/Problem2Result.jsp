<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	table,th,td{
		border: 1px solid black;
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
	<div>
		<h1>Problem 2</h1>
		<h1>Student list</h1>
		<table>
	      <tr>
	       <th>Reg Number</th>
	       <th>Name</th>
	       <th>Fees</th>
	      </tr>
	
	      <c:forEach var="student" items="${studentlist}">
	       <tr>
	        <td>${student.regNo}</td>
	        <td>${student.name}</td>
	        <td>${student.fees}</td>
	       </tr>
	      </c:forEach>
	
	     </table>
     
     	<p style="text-align: center;"><a href="index.jsp">Click here to return to main menu</a></p>
		<p style="text-align: center;"><a href="PreInsert">Click here to add Student</a></p>
	</div>	
</body>
</html>