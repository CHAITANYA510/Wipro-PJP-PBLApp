<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
		<style>
			div{
				text-align: center;
			}
			table,th,td{
				margin-left: auto;
				margin-right: auto;
			}
		</style>
		<script type="text/javascript">
			function validation(){
	            var empnum = document.getElementByName("empno").value;
	            var regexp = [a-zA-Z]{1}\d{4};
	            
	            alert("Enter emp number is "+empnum);
	            
	            if(empnum.match(regexp)){
	                return true;
	            }
	            else{
	                alert("Enter emp number in format of single alphabet followed by 4 digits");
	                return false;
	            }
	        } 
		</script>
</head>
<body>
        <div style="font-size: 20px;"> 
            <h1>Registration page</h1>
        	<h2 style="text-align:center; color:red; font-size:30px;"> ${message} </h2>
			<form name="RegisterAdmin" action="Register" method="post" onsubmit="return validation()">
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
						<td>Enter employee number</td>
					 	<td><input type="text" name="empno" required="required"></td>
					</tr>
					<tr>
						<td>Enter email</td>
					 	<td><input type="email" name="email" required="required"></td>
					</tr>
					<tr>
						<td colspan="2">	
							<input type="submit" value="Register Admin">
							<input type="reset" value="Reset">
						</td>
					</tr>	
				</table>
			</form>
		</div>
    </body>
</html>