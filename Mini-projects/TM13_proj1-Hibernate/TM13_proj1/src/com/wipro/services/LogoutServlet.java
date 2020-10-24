package com.wipro.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        HttpSession session = request.getSession(); 
        
        //System.out.println(session.getAttribute("username")+"::"+session.getAttribute("password"));
        
        if(session.getAttribute("username")!=null && session.getAttribute("password")!=null) {
        	
	         session.invalidate();  
	         System.out.println("Successfully logged out!");
	         request.setAttribute("message", "Logout successful, Login again");
	         request.getRequestDispatcher("index.jsp").forward(request, response);
	         //out.print("Successfully logged out!");  
        }
        else {
        	System.out.println("Invalid action!! login first");
        	request.setAttribute("message", "Incorrect option, Login first!!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
       	 	//out.print("Invalid action!! login first");  
        }
        
        //response.sendRedirect("index.html");
        out.close();  
		
	}

}
