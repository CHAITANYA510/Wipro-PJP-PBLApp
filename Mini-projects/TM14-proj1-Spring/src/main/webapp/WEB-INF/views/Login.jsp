<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Login page</title>
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
        <div style="font-size: 20px;"> 
            <h1>Login page</h1>
        	<h2 style="text-align:center; color:red; font-size:30px;"> ${message} </h2>
			<form name="AdminLogin" action="Login" method="post">
				<table>
					<tr>
						<td>Enter user name</td>
					 	<td><input type="text" name="username" required="required"></td>
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
			<h2><a href="PreRegister">Click here to Register</a></h2>
		</div>
    </body>
</html>