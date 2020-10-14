

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			
			for (Cookie c:cookies) {
				
                Cookie cookie = c;
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
			
			out.print("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Problem 2</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<h1>Cookie deleted</h1>\r\n" +
					"	<a href=\"Problem2\">Add cookies</a>\r\n" + 
					"	<a href=\"displayServlet\">Display cookies</a>\r\n" + 
					"</body>\r\n" + 
					"</html>");
			
		}
		else {
			out.print("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Problem 2</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<h1>No cookies found</h1>\r\n" + 
					"	<a href=\"Problem2.html\">Add cookies</a>\r\n" + 
					"</body>\r\n" + 
					"</html>");	
		}
		
		out.close();
	}

}
