package com.wipro.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.DAO.EmployeeTransactions;
import com.wipro.bean.Employee;

public class UpdateEmployeeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(false); 
		
		ValidateLogin vl = new ValidateLogin(session);
		
		if(vl.isLoggedIn()) {
		
			int ID = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			
			EmployeeTransactions emptrx = new EmployeeTransactions(); 
			
			if(emptrx.employeeExist(ID,name)) {
				
				Employee emp = emptrx.displayEmployee(ID);
				//System.out.println(emp);
				request.setAttribute("emp", emp);
				RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
				rd.forward(request, response);
			}
			else {
				System.out.println("employee does not exist");
				//pw.print("employee does not exist");
				//response.sendRedirect("Add.html");
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
						"            <h1>Employee with given data does not exist</h1>\r\n" + 
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
