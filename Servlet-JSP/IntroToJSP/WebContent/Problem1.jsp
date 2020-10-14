
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%> 
<% 
	ArrayList<Integer> list = (ArrayList<Integer>)request.getAttribute("listOfPrimes");  
	int number = Integer.parseInt(request.getParameter("number"));
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Problem 1</title>
</head>
<body>
	<h1>Prime numbers less then <%= number %> are:</h1>
      <table border ="1" align="center">
       <% if(list!=null){
    	   	Iterator<Integer> itr = list.iterator();
        	while(itr.hasNext()){
        %> 
            <tr> 
                <td><%= itr.next() %></td> 
            </tr> 
        <% 
        	} 
        }
       else{
        %> 
        <tr> 
             <td>No prime number found</td> 
        </tr> 
        <% 
        } 
        %>
        </table>  
        <hr/> 
        <a href="Problem1.html">Click here to try again</a>
    </body>
</body>
</html>