

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String name = new String(request.getParameter("name"));
		
		try {
			Connection conn = DBUtil.getConn();
			PreparedStatement pstmt;
			String query;
			String table_name = "data_table_2";
			
			query = "SELECT * FROM "+table_name+" WHERE username="+name;
			pstmt = conn.prepareStatement(query);
			//System.out.println(query);
			ResultSet rs = pstmt.executeQuery();
			
			if(!rs.next()) {
				
				int ID = Integer.parseInt(request.getParameter("ID"));
				String email = request.getParameter("email");
				String pwd = request.getParameter("pwd");
				
				query = "INSERT INTO "+table_name+" VALUES(?,?,?,?)";
				pstmt = conn.prepareStatement(query);
				//System.out.println(query);
				
				pstmt.setString(1, name);
				pstmt.setInt(2, ID);
				pstmt.setString(3, pwd);
				pstmt.setString(4, email);
				
				int t = pstmt.executeUpdate();
				
				if(t == 1) {
					//data stored
					String message = "User data saved successfully!!";
					out.print("<!DOCTYPE html>\r\n" + 
							"<html>\r\n" + 
							"<head>\r\n" + 
							"<meta charset=\"ISO-8859-1\">\r\n" + 
							"<title>Project 2</title>\r\n" + 
							"<style>\r\n" + 
							"	h1,h3{\r\n" + 
							"		text-align: center;\r\n" + 
							"		text-size: 30px;\r\n" + 
							"		text-color: green;\r\n" + 
							"	}\r\n" + 
							"</style>\r\n" + 
							"</head>\r\n" + 
							"<body>\r\n" + 
							"	<h1>"+message+"</h1>\r\n" + 
							"	<h3><a href=\"index.html\">Click here to go to main menu</a></h3>\r\n" + 
							"</body>\r\n" + 
							"</html>");
					
				}
				else {
					//data not saved
					String message = "Data not saved!!";
					out.print("<!DOCTYPE html>\r\n" + 
							"<html>\r\n" + 
							"<head>\r\n" + 
							"<meta charset=\"ISO-8859-1\">\r\n" + 
							"<title>Project 2</title>\r\n" + 
							"</head>\r\n" + 
							"<body>\r\n" + 
							"	<h1 style=\"text-align:center;\">User Login portal</h1>\r\n" + 
							"	<h2 style=\"text-align:center; text-color:red;\">"+message+"</h2>\r\n" + 
							"	<p style=\"text-align:center; font-size:30px; text-color:blue\"><a href=\"index.html\">Click here to go to main menu</a></p>\r\n" + 
							"</body>\r\n" + 
							"</html>");
				}
			}
			else {
				//user exist
				String message = "User does already exist";
				out.print("<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"<head>\r\n" + 
						"<meta charset=\"ISO-8859-1\">\r\n" + 
						"<title>Project 2</title>\r\n" + 
						"</head>\r\n" + 
						"<body>\r\n" + 
						"	<h1 style=\"text-align:center;\">User Login portal</h1>\r\n" + 
						"	<h2 style=\"text-align:center; text-color:green;\">"+message+"</h2>\r\n" + 
						"	<p style=\"text-align:center; font-size:30px; text-color:blue\"><a href=\"Login.html\">Click here to Login.</a></p>\r\n" + 
						"</body>\r\n" + 
						"</html>");
				
			}
			
		} 
		catch (Exception e) {
			response.sendRedirect("Registration.html");
			e.printStackTrace();
		}
	}

}
