package com.wipro.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.DAO.EmployeeTransactions;
import com.wipro.bean.Employee;

public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false); 
		ValidateLogin vl = new ValidateLogin(session);
		
		if(vl.isLoggedIn()) {
		
			String name = request.getParameter("name");
			//int ID = Integer.parseInt(request.getParameter("id"));
			String gender = request.getParameter("gender");
			String designation = request.getParameter("designation");
			String city = request.getParameter("city");
			String emailID = request.getParameter("emailID");
			float salary = Float.parseFloat(request.getParameter("salary"));
			long mobileNo = Long.parseLong(request.getParameter("mobile"));
			
			Employee emp = new Employee();
			EmployeeTransactions emptrx = new EmployeeTransactions(); 
			//boolean employeeExist = false;
			
			//emp.setID(ID);
			emp.setName(name);
			emp.setGender(gender);
			emp.setDesignation(designation);
			emp.setEmailID(emailID);
			emp.setCity(city);
			emp.setSalary(salary);
			emp.setMobileNo(mobileNo);
			
			System.out.println(emp);
			
				if(emptrx.addEmployee(emp)) {
					
					//out.print("employee data stored");
					out.print("<!DOCTYPE html>\r\n" + 
							"<html>\r\n" + 
							"    <head>\r\n" + 
							"        <title>Display</title>\r\n" + 
							"        <style>\r\n" + 
							"            h1{\r\n" + 
							"                text-align:center;\r\n" + 
							"                color:green;\r\n" + 
							"            }\r\n" + 
							"            p{\r\n" + 
							"                text-align:center;\r\n" + 
							"                font-size: 25px;\r\n" + 
							"            } \r\n" + 
							"            body{\r\n" + 
							"                background-color: skyblue;\r\n" + 
							"            }\r\n" + 
							"        </style>\r\n" + 
							"    </head>\r\n" + 
							"    <body>\r\n" + 
							"        <div style=\"font-size: 20px;\">\r\n" + 
							"            <h1>Employee data stored</h1>\r\n" + 
							"            <p><a href=\"Display.html\">Click here to Display Employee</a></p>\r\n" + 
							"            <p><a href=\"Menu.html\">Click here to go to Main menu</a></p>\r\n" + 
							"        </div>\r\n" + 
							"    </body>\r\n" + 
							"</html>");
					//response.sendRedirect("Add.html");
				}
				else {
					//out.print("employee data not stored");
					out.print("<!DOCTYPE html>\r\n" + 
							"<html>\r\n" + 
							"    <head>\r\n" + 
							"        <title>Display</title>\r\n" + 
							"        <style>\r\n" + 
							"            h1{\r\n" + 
							"                text-align:center;\r\n" + 
							"                color:red;\r\n" + 
							"            }\r\n" + 
							"            p{\r\n" + 
							"                text-align:center;\r\n" + 
							"                font-size: 25px;\r\n" + 
							"            } \r\n" + 
							"            body{\r\n" + 
							"                background-color: skyblue;\r\n" + 
							"            }\r\n" + 
							"        </style>\r\n" + 
							"    </head>\r\n" + 
							"    <body>\r\n" + 
							"        <div style=\"font-size: 20px;\">\r\n" + 
							"            <h1>Employee data not stored!!</h1>\r\n" + 
							"            <p><a href=\"Add.html\">Click here to Add Employee</a></p>\r\n" + 
							"            <p><a href=\"Menu.html\">Click here to go to Main menu</a></p>\r\n" + 
							"        </div>\r\n" + 
							"    </body>\r\n" + 
							"</html>");
					//response.sendRedirect("Add.html");
				}
			}
		else {
			System.out.println("Either logged out or invalid credentials");
            //response.sendRedirect("index.html");
			out.print("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"    <head>\r\n" + 
					"        <title>Display</title>\r\n" + 
					"        <style>\r\n" + 
					"            h1{\r\n" + 
					"                text-align:center;\r\n" + 
					"                color:red;\r\n" + 
					"            }\r\n" + 
					"            p{\r\n" + 
					"                text-align:center;\r\n" + 
					"                font-size: 25px;\r\n" + 
					"            } \r\n" + 
					"            body{\r\n" + 
					"                background-color: skyblue;\r\n" + 
					"            }\r\n" + 
					"        </style>\r\n" + 
					"    </head>\r\n" + 
					"    <body>\r\n" + 
					"        <div style=\"font-size: 20px;\">\r\n" + 
					"            <h1>Either logged out or invalid credentials!!</h1>\r\n" + 
					"            <p><a href=\"index.html\">Click here to Login</a></p>\r\n" + 
					"        </div>\r\n" + 
					"    </body>\r\n" + 
					"</html>");
		}
		out.close();
	}

}
