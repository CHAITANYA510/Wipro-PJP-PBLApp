<%@ page import="calcu.CalculateFactorial" %>
<%
int n1 = Integer.parseInt(request.getParameterValues("startNumber")[0]);
int n2 = Integer.parseInt(request.getParameterValues("endNumber")[0]);
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Problem 3</title>
</head>
<body>
	<% 
		if(n1<=n2){
			out.print("<h2>Start number is "+n1+" End number is "+n2+"</h2>");
			out.print("List of factorials is:");
	%>
	<table border="1">
		<tr>
			<th>Number</th>
			<th>Factorial</th>
		</tr>
	<%	
		CalculateFactorial obj = new CalculateFactorial();
			while(n2>=n1){
				out.print("<tr>" +
						"<th>"+n1+"</th>" +
						"<th>"+obj.calc(n1)+"</th>" +
						"</tr>");
				n1++;
			}
		}
		else{
			out.print("<h2>Start number is greater than End number</h2>");
		}
	%>
	</table>
	<a href="Problem3.html">Click here to retry!!</a>
</body>
</html>