<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <style>
            h1{
                text-align:center;
                font-size: 35px;
            }
            body{
                background-color: grey;
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
            <h1>Login page</h1>
            <h2 style="text-align:center; color:red; font-size:30px;">
            	<%= (String)request.getAttribute("message") %>
            </h2>
            <form name="loginform" action="LoginServlet" method="post">
                <table>
                    <tr>
                        <td><label for="username">Enter name</label></td>
                        <td><input type="text" id="username" name="username"></td>
                    </tr>
                    <tr>
                        <td><label for="id">Enter password</label></td>
                        <td><input type="password" id="password" name="password"></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <input type="submit" value="Login">
                            <input type="reset">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>