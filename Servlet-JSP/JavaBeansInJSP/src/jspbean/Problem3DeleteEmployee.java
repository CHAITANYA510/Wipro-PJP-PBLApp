package jspbean;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem3DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection conn = DBConn.getConn();
			Problem3Bean emp = (Problem3Bean) request.getAttribute("empobj");
			
			String table_name = "JSPemployee";
			String query = "DELETE FROM "+table_name+" WHERE ID="+emp.getID();
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			int t = pstmt.executeUpdate();
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			if(t == 1) {
				out.print("<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"<head>\r\n" + 
						"<meta charset=\"ISO-8859-1\">\r\n" + 
						"<title>Problem 3</title>\r\n" + 
						"</head>\r\n" + 
						"<body>\r\n" + 
						"	<h1>Employee data deleted</h1>\r\n" + 
						"   <a href=\"Problem3AddEmployee.html\">Click here to add employee.</a> " +
						"   <a href=\"Problem3-DeleteEmp.html\">Click here to delete employee.</a> " +
						"</body>\r\n" + 
						"</html>");
			}
			else {
				out.print("<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"<head>\r\n" + 
						"<meta charset=\"ISO-8859-1\">\r\n" + 
						"<title>Problem 3</title>\r\n" + 
						"</head>\r\n" + 
						"<body>\r\n" + 
						"	<h1>Employee data was not found</h1>\r\n" + 
						"   <a href=\"Problem3-DeleteEmp.html\">Click here to retry.</a> " +
						"</body>\r\n" + 
						"</html>");
			}
			
			out.close();
			pstmt.close();
			conn.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
