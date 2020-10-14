
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Problem 1</title>
</head>
<body>
	<jsp:useBean id="emp" class="jspbean.Problem1"/>
	<jsp:setProperty name="emp" property="name" value='<%=request.getParameter("name")%>' />
	<jsp:setProperty name="emp" property="empID" value='<%= Integer.parseInt(request.getParameter("empID"))%>' />
	<jsp:setProperty name="emp" property="salary" value='<%= Double.parseDouble(request.getParameter("salary"))%>'/>

	<h1>Employee name: <jsp:getProperty name="emp" property="name"/></h1>
	<h1>Employee ID: <jsp:getProperty name="emp" property="empID"/></h1>
	<h1>Salary: <jsp:getProperty name="emp" property="salary"/></h1>
</body>
</html>