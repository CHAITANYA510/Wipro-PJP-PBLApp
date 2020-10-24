package com.wipro.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.DAO.EmployeeTransactions;

public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		
		HttpSession session = request.getSession(false); 
		
		ValidateLogin vl = new ValidateLogin(session);
		
		if(vl.isLoggedIn()) {
			
			int ID = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			boolean employeeExist = false;
			
			EmployeeTransactions emptrx = new EmployeeTransactions(); 
			
			if(emptrx.employeeExist(ID)) {
				employeeExist = true;
			}
			
			if(employeeExist) {
				if(emptrx.deleteEmployee(ID,name)) {
					System.out.println("employee deleted");
					pw.print("<!DOCTYPE html>\r\n" + 
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
							"            <h1>Employee deleted</h1>\r\n" + 
							"            <p><a href=\"Delete.html\">Click here to Delete another Employee</a></p>\r\n" + 
							"            <p><a href=\"Menu.html\">Click here to go to Main menu</a></p>\r\n" + 
							"        </div>\r\n" + 
							"    </body>\r\n" + 
							"</html>");
					//response.sendRedirect("Delete.html");
				}
				else {
					System.out.println("employee ID and name not matched");
					pw.print("<!DOCTYPE html>\r\n" + 
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
							"            <h1>Employee credentials not matched</h1>\r\n" + 
							"            <p><a href=\"Delete.html\">Click here to try again!!</a></p>\r\n" + 
							"            <p><a href=\"Menu.html\">Click here to go to Main menu</a></p>\r\n" + 
							"        </div>\r\n" + 
							"    </body>\r\n" + 
							"</html>");
					//response.sendRedirect("Delete.html");
				}
			}
			else {
				System.out.println("employee does not exist with entered information");
				pw.print("<!DOCTYPE html>\r\n" + 
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
						"            <h1>Employee with given details does not exist</h1>\r\n" + 
						"            <p><a href=\"Add.html\">Click here to Add Employee</a></p>\r\n" + 
						"            <p><a href=\"Menu.html\">Click here to go to Main menu</a></p>\r\n" + 
						"        </div>\r\n" + 
						"    </body>\r\n" + 
						"</html>");
			}
		}
		else {
			System.out.println("Either logged out or invalid credentials");
            //response.sendRedirect("index.html");
			pw.print("<!DOCTYPE html>\r\n" + 
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
		pw.close();
		
	}

}
