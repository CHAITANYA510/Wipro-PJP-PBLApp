package com.wipro.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.DAO.EmployeeTransactions;
import com.wipro.bean.Employee;

public class DisplayAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(false); 
		
		ValidateLogin vl = new ValidateLogin(session);
		
		if(vl.isLoggedIn()) {		
			
			EmployeeTransactions emptrx = new EmployeeTransactions();
			Collection<Employee> coll = emptrx.displayAllEmployee();
			
			if(coll!=null) {
				Object[] emp = coll.toArray();
				//System.out.println(emp);
				
				for(Object em:emp) {
					pw.println(em+"<br>");
				}
					
				request.setAttribute("emp", emp);
				RequestDispatcher rd = request.getRequestDispatcher("DisplayAll.jsp");
				rd.forward(request, response);
				
			}
			else{
				System.out.println("no record found");
				//pw.print("no record found");
				///response.sendRedirect("Add.html");
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
						"            <h1>No record found, table empty!!</h1>\r\n" + 
						"            <p><a href=\"Add.html\">Click here to Add Employee</a></p>\r\n" + 
						"            <p><a href=\"Menu.html\">Click here to go to Main menu</a></p>\r\n" + 
						"        </div>\r\n" + 
						"    </body>\r\n" + 
						"</html>");
			}
		}
		else {
			System.out.println("Either logged out or invalid credentials");
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
