<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display employee</title>
	<style>
    		h1{
                text-align:center;
                font-size: 35px;
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
                        <td>ID</td>
                        <td>${emp.ID}</td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td>${emp.name}</td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td>${emp.gender}</td>
                    </tr>
                    <tr>
                        <td>Designation</td>
                        <td>${emp.designation}</td>
                    </tr>
                    <tr>
                        <td>Salary</td>
                        <td>${emp.salary}</td>
                    </tr>
                    <tr>
                        <td>City</td>
                        <td>${emp.city}</td>
                    </tr>
                    <tr>
                        <td>Email Id</td>
                        <td>${emp.emailID}</td>
                    </tr>
                    <tr>
                        <td>Mobile number</td>
                        <td>${emp.mobileNo}</td>
                    </tr>
                </table>
            
        </div>
</body>
</html>