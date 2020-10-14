package jspbean;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem3DisplayAllEmployee extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection conn = DBConn.getConn();
			
			String table_name = "JSPemployee";
			String query = "SELECT * FROM "+table_name;
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Problem 3</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<h1>Employee data</h1>\r\n");
			
			out.print("<table border=\"1\">"
					+ "<tr>"
					+ "<th>Employee name</th>"
					+ "<th>Employee ID</th>"
					+ "<th>Employee designation</th>"
					+ "</tr>");
			
			while(rs.next()) {
				
				out.print("<tr>"
						+ "<td>"+rs.getString("name")+"</td>"
						+ "<td>"+rs.getInt("ID")+"</td>"
						+ "<td>"+rs.getString("designation")+"</td>"
						+ "</tr>");
			}
			
			out.print("</table>");
			
			out.print("<a href=\"Problem3-AddEmp.html\">Click here to add employee.</a> " +
					"  <a href=\"Problem3-DeleteEmp.html\">Click here to delete employee.</a> " +
					"</body>\r\n" + 
					"</html>");
			
			out.close();
			pstmt.close();
			conn.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
