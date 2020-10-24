<%@ page import="com.wipro.bean.Employee" %>
<%
	Object[] empTable = (Object[])request.getAttribute("emp");
	Employee[] arr = new Employee[empTable.length];
	for(int i=0;i<empTable.length;i++) {
		 arr[i] = (Employee)empTable[i];	
	}
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Display All</title>
	<style>
    		h1{
                text-align:center;
                font-size: 35px;
            }
            body{
                background-color: skyblue;
            }
            table{
                margin-right: auto;
                margin-left: auto;
            }
            td{
                padding: 3px;
            }
     </style>
</head>
<body>
	<div style="font-size: 20px;">
            <h1>Display All Employee</h1>
                <table border="1">
                	<tr>
                		<th>ID</th>
                		<th>Name</th>
                		<th>Gender</th>
                		<th>Designation</th>
                		<th>Salary</th>
                		<th>City</th>
                		<th>Email</th>
                		<th>Mobile</th>
                	</tr>
                	
                	<% for(Employee emp:arr) { %>
	                    <tr>
	                        <td><%= emp.getID() %></td>
	                        <td><%= emp.getName() %></td>
	                        <td><%= emp.getGender() %></td>
	                        <td><%= emp.getDesignation() %></td>
	                        <td><%= emp.getSalary() %></td>
	                        <td><%= emp.getCity() %></td>
	                        <td><%= emp.getEmailID() %></td>
	                        <td><%= emp.getMobileNo() %></td>
	                    </tr>
                    <% } %>
                </table>
        </div>
        <h1><a href="Add.html">Click here to add employee</a></h1>
        <h1><a href="Delete.html">Click here to delete employee</a></h1>
        <h1><a href="Menu.html">Click here to return to main menu</a></h1>
</body>
</html>