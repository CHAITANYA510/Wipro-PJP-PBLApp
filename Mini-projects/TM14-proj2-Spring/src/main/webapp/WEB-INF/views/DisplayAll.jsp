<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display all Employee</title>
<style>
			div{
				text-align: center;
			}
    		h1{
                text-align:center;
                font-size: 35px;
            }
            table{
                margin-right: auto;
                margin-left: auto;
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
                	<c:forEach var="emp" items="${empList}">
		                <tr>
		                        <td> ${emp.getID()} </td>
		                        <td> ${emp.getName()} </td>
		                        <td> ${emp.getGender()} </td>
		                        <td> ${emp.getDesignation()} </td>
		                        <td> ${emp.getSalary()} </td>
		                        <td> ${emp.getCity()} </td>
		                        <td> ${emp.getEmailID()} </td>
		                        <td> ${emp.getMobileNo()} </td>
		                 </tr>
                   </c:forEach>
           </table>   
           <h2><a href="PreDelete">Click here to Delete employee</a></h2>
    </div>
</body>
</html>