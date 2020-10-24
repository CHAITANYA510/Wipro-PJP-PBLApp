package com.wipro.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(uname.equals("admin") && pass.equals("admin")) {
			 HttpSession session = request.getSession();  
		     session.setAttribute("username",uname);
		     session.setAttribute("password", pass);
		     System.out.println("logged successful");
		     request.getRequestDispatcher("Menu.html").forward(request, response);  
		}
		else {
			System.out.println("logged failed");
			request.setAttribute("message", "Login credentials incorrect!!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			///response.sendRedirect("index.jsp");
		}
		
	}

}
