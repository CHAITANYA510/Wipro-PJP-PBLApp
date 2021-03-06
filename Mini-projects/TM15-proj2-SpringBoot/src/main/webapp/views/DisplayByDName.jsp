<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Project 2</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
    		h1{
                font-size: 35px;
            }
            table{
                margin-right: auto;
                margin-left: auto;
            }
</style>
</head>
<body>
	<div style="text-align: center; font-size: 20px;">
         <h1>${message }</h1>
            <table  class="table table-bordered table-str">
            		<tr>
                		<td colspan="3">
                			Department name : ${deptName }
                		</td>
                	</tr>
                	<tr>
                		<th>Department ID</th>
						<th>Department Location</th>	
                		<th>Department Budget</th>
                	</tr>
                	<c:forEach var="dept" items="${deptList}">
		             <tr>
		                        <td> ${dept.getDeptno()} </td>
		                        <td> ${dept.getLoc()} </td>
		                        <td> ${dept.getBudget()} </td>
		            </tr>
                   </c:forEach>
           </table>   
           <h1 style="text-align: center; font-size: 25px;"><a href="menu">Click here to go to menu</a></h1>
    </div>
</body>
</html>