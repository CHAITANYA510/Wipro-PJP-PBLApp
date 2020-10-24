<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update employee</title>
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
	<div style="font-size: 20px;">
            <h1>Update Employee</h1>
            <form name="UpdateEmployee" action="Update2" method="post">
            	<input name="ID" type="hidden" value="${emp.ID}" >
            	<input name="name" type="hidden" value="${emp.name}">
                <table border="1"> 
                    <tr>
                        <td>ID</td>
                        <td colspan="2" style="text-align:center">${emp.ID}</td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td colspan="2" style="text-align:center">${emp.name}</td>
                    </tr>
                    <tr>
                		<th>Property</th>
                		<th>Saved data</th>
                        <th>Update data</th>
                	</tr>
                    <tr>
                        <td><label for="gender">Gender</label></td>
                        <td>${emp.gender}</td>
                        <td>
                            <input type="radio" id="gender" name="gender" value="Male">Male
                            <input type="radio" name="gender" value="Female">Female
                            <input type="radio" name="gender" value="Others">Others
                        </td>
                    </tr>
                    <tr>
                        <td><label for="designation">Designation</label></td>
                        <td>${emp.designation}</td>
                        <td>
                            <select id="designation" name="designation">
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
                        <td><label for="salary">Salary</label></td>
                        <td>${emp.salary}</td>
                        <td><input type="number" id="salary" name="salary" min="1000"></td>
                    </tr>
                    <tr>
                        <td><label for="city">City</label></td>
                        <td>${emp.city}</td>
                        <td><input type="text" id="city" name="city"></td>
                    </tr>
                    <tr>
                        <td><label for="emailID">Email Id</label></td>
                        <td>${emp.emailID}</td>
                        <td><input type="email" id="emailID" name="emailID"></td>
                    </tr>
                    <tr>
                        <td><label for="mobile">Mobile number</label></td>
                        <td>${emp.mobileNo}</td>
                        <td><input type="text" id="mobile" name="mobileNo"></td>
                    </tr>
                    <tr>
                        <td colspan="3" style="text-align: center;">
                            <input type="submit" value="Update Employee">
                            <input type="reset">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
</body>
</html>