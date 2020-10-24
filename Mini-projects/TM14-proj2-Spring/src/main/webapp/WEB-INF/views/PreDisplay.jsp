<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display employee</title>
	<style>
	h2{
		color:red;
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
            <h1>Display Employee</h1>
            <h2>${message}</h2>
            <form name="DisplayEmployee" action="Display" method="post">
                <table>
                    <tr>
                        <td><label for="id">Enter Employee ID</label></td>
                        <td><input type="number" id="id" name="ID" min="1" required></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <input type="submit" value="Display Employee">
                            <input type="reset">
                        </td>
                    </tr>
                </table>
            </form>
            <h2><a href="DisplayAll">Click here to Display all employee</a></h2>
        </div>
</body>
</html>