<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Project 2</title>
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
<div class="container pt-3">
		<h1>Delete Department</h1>
		<form action="deleteDeptByName">
			<div class="form-group">
				<table>
					<tr>
						<td>Enter Department Name</td>
					 	<td><input type="text" name="dname" class="form-control" required="required"></td>
					</tr>
					<tr>
						<td colspan="2">	
							<input type="submit" value="Delete">
							<input type="reset" value="Reset">
						</td>
					</tr>	
				</table>
			</div>
		</form> 		       
	</div>
</body>
</html>