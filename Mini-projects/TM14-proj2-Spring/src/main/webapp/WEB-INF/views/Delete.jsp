<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete employee</title>
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
            <h1>Delete Employee</h1>
            <h2 style="color:red;">${message}</h2>
            <form name="DeleteEmployee" action="Delete" method="post">
                <table>
                    <tr>
                        <td><label for="name">Enter name</label></td>
                        <td><input type="text" id="name" name="name" required></td>
                    </tr>
                    <tr>
                        <td><label for="id">Enter ID</label></td>
                        <td><input type="number" id="id" name="ID" min="1" required></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <input type="submit" value="Delete Employee">
                            <input type="reset">
                        </td>
                    </tr>
                </table>
            </form>
            <h2><a href="PreDisplay">Click here to Display employee</a></h2>
            <h2><a href="DisplayAll">Click here to Display all employee</a></h2>
        </div>
</body>
</html>