<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
    <head>
        <title>Login page</title>
		<style>
			body{
				background-color: #6bc7c7;
			}
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
        <div style="font-size: 20px;"> 
            <h1>Login page</h1>
        	<h2 style="text-align:center; color:red; font-size:30px;"> ${message} </h2>
			<form name="Login" action="Login" method="post">
				<table>
					<tr>
						<td>Enter Customer ID</td>
					 	<td><input type="text" name="customerID" required="required"></td>
					</tr>	
					<tr>
						<td>Enter password</td>
					 	<td><input type="password" name="password" required="required"></td>
					</tr>	
					<tr>
						<td colspan="2">	
							<input type="submit" value="Login">
							<input type="reset" value="Reset">
						</td>
					</tr>	
				</table>
			</form>
		</div>
    </body>
</html>