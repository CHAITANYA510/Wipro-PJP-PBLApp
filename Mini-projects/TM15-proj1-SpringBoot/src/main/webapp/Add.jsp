<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Project 1</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
	div{
		text-align: center;
	}
	table,th,td{
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
	<div class="container pt-3">
		<h1>Add Department</h1>
		<form action="addDept">
			<div class="form-group">
				<table>
					<tr>
						<td>Enter Department Name</td>
					 	<td><input type="text" name="dname" class="form-control" required="required"></td>
					</tr>	
					<tr>
						<td>Enter Department Location</td>
					 	<td><input type="text" name="loc" class="form-control" required="required"></td>
					</tr>	
					<tr>
						<td>Enter Department Budget</td>
					 	<td><input type="number" name="budget" class="form-control" required="required"></td>
					</tr>	
					<tr>
						<td colspan="2">	
							<input type="submit" value="Add Department">
							<input type="reset" value="Reset">
						</td>
					</tr>	
				</table>
			</div>
		</form> 		       
	</div>
</body>
</html>