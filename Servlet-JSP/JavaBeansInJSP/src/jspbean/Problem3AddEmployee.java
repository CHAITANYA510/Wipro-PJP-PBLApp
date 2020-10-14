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

public class Problem3AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection conn = DBConn.getConn();
			Problem3Bean emp = (Problem3Bean) request.getAttribute("empobj");

			//System.out.println(emp.getName()+"::"+emp.getID()+"::"+emp.getDesignation());
			String table_name = "JSPemployee";
			String query = "SELECT * FROM "+table_name+" WHERE ID="+emp.getID();
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");

			if(rs.next()) {
				out.print("<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"<head>\r\n" + 
						"<meta charset=\"ISO-8859-1\">\r\n" + 
						"<title>Problem 3</title>\r\n" + 
						"</head>\r\n" + 
						"<body>\r\n" + 
						"	<h1>Employee information already exist</h1>\r\n" + 
						"   <a href=\"Problem3-AddEmp.html\">Click here to retry.</a> " +
						"   <a href=\"Problem3-DeleteEmp.html\">Click here to delete employee.</a> " +
						"</body>\r\n" + 
						"</html>");
			}

			else {
				query = "INSERT INTO "+table_name+" VALUES(?,?,?)";

				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, emp.getName());
				pstmt.setInt(2, emp.getID());
				pstmt.setString(3, emp.getDesignation());

				int t = pstmt.executeUpdate();

				if(t == 1) {
					out.print("<!DOCTYPE html>\r\n" + 
							"<html>\r\n" + 
							"<head>\r\n" + 
							"<meta charset=\"ISO-8859-1\">\r\n" + 
							"<title>Problem 3</title>\r\n" + 
							"</head>\r\n" + 
							"<body>\r\n" + 
							"	<h1>Employee information was stored</h1>\r\n" + 
							"   <a href=\"Problem3-AddEmp.html\">Click here to add another employee.</a> " +
							"   <a href=\"Problem3-DeleteEmp.html\">Click here to delete employee.</a> " +
							"</body>\r\n" + 
							"</html>");
				}
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
