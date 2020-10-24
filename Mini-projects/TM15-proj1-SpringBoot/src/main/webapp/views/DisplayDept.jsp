<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Project 1</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
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
	<h1>${message }</h1>
                <table class="table table-bordered table-str"> 
                    <tr>
                		<th>Property</th>
                		<th>Saved data</th>
                	</tr>
                	<tr>
                        <td>Department ID</td>
                        <td>${dept.deptno}</td>
                    </tr>
                    <tr>
                        <td>Location</td>
                        <td>${dept.loc}</td>
                    </tr>
                    <tr>
                        <td>Budget</td>
                        <td>${dept.budget}</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <h1 style="text-align: center;"><a href="menu">Click here to go to menu</a></h1>
                        </td>
                    </tr>
                </table>
</body>
</html>