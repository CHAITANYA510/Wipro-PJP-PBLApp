

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class deleteSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		session.invalidate();
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Problem 3</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<h1>Session deleted</h1>\r\n" + 
				"	<a href=\"Problem3\">Click here to start session tracking</a>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
		out.close();
	}

}
