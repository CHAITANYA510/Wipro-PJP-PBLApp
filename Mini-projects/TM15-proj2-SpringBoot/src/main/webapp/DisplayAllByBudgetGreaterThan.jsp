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
		<h1>Display All Department Where budget greater than</h1>
		<form action="showDeptBudgetGreaterThan">
			<div class="form-group">
				<table>
					<tr>
						<td>Enter Department Budget</td>
					 	<td><input type="number" name="budget" class="form-control" required="required"></td>
					</tr>
					<tr>
						<td colspan="2">	
							<input type="submit" value="Display">
							<input type="reset" value="Reset">
						</td>
					</tr>	
				</table>
			</div>
		</form> 		       
	</div>
</body>
</html>