<%@ page import="com.wipro.bean.Employee" %>
<%
	Employee em = (Employee)request.getAttribute("emp");
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Display</title>
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
            <h1>Display Employee</h1>
                <table border="1">
                	<tr>
                		<th>Property</th>
                		<th>Employee data</th>
                	</tr>
                    <tr>
                        <td>ID</td>
                        <td><%= em.getID() %></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><%= em.getName() %></td>
                    </tr>
                    <tr>
                        <td><label for="gender">Gender</label></td>
                        <td><%= em.getGender() %></td>
                    </tr>
                    <tr>
                        <td><label for="designation">Designation</label></td>
                        <td><%= em.getDesignation() %></td>
                    </tr>
                    <tr>
                        <td><label for="salary">Salary</label></td>
                        <td><%= em.getSalary() %></td>
                    </tr>
                    <tr>
                        <td><label for="city">City</label></td>
                        <td><%= em.getCity() %></td>
                    </tr>
                    <tr>
                        <td><label for="emailID">Email Id</label></td>
                        <td><%= em.getEmailID() %></td>
                    </tr>
                    <tr>
                        <td><label for="mobile">Mobile number</label></td>
                        <td><%= em.getMobileNo() %></td>
                    </tr>
                </table>
        </div>
        <h1><a href="Display.html">Click here to display another employee</a></h1>
        <h1><a href="http://localhost:8080/TM-13/DisplayAllEmployeeServlet">Click here to display all employee</a></h1>
        <h1><a href="Menu.html">Click here to return to main menu</a></h1>
</body>
</html>