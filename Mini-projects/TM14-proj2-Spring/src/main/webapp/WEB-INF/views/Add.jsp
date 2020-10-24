<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
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
            <h1>Add Employee</h1>
            <form name="AddEmployee" action="Add" method="post">
                <table>
                    <tr>
                        <td><label for="name">Enter name</label></td>
                        <td><input type="text" id="name" name="name" required></td>
                    </tr>
                    <tr>
                        <td><label for="gender">Enter gender</label></td>
                        <td>
                            <input type="radio" id="gender" name="gender" value="Male" required>Male
                            <input type="radio" name="gender" value="Female" required>Female
                            <input type="radio" name="gender" value="Others" required>Others
                        </td>
                    </tr>
                    <tr>
                        <td><label for="designation">Enter Designation</label></td>
                        <td>
                            <select id="designation" name="designation" required>
                                <optgroup label="Cateory">
                                    <option value="Employee" selected>Employee</option>
                                    <option value="Manager">Manager</option>
                                    <option value="Regional Head">Regional Head</option>
                                    <option value="COO">COO</option>
                                    <option value="CEO">CEO</option>
                                    <option value="Director">Director</option>
                                    <option value="Employee">Employee</option>
                                    <option value="Others">Others</option>
                                </optgroup>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="salary">Enter Salary</label></td>
                        <td><input type="number" id="salary" name="salary" min="1000" required></td>
                    </tr>
                    <tr>
                        <td><label for="city">Enter City</label></td>
                        <td><input type="text" id="city" name="city" required></td>
                    </tr>
                    <tr>
                        <td><label for="emailID">Enter Email Id</label></td>
                        <td><input type="email" id="emailID" name="emailID" required></td>
                    </tr>
                    <tr>
                        <td><label for="mobile">Enter mobile number</label></td>
                        <td><input type="text" id="mobile" name="mobileNo" required></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <input type="submit" value="Add Employee">
                            <input type="reset">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
</body>
</html>