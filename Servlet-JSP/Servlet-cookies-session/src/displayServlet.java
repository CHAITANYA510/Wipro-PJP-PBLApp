

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class displayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			
			out.print("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Problem 2</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<h1>Display Cookies</h1>\r\n" + 
					"	<table>");
			
			for(Cookie c:cookies) {
				
				Cookie c2 = c;
				String cookieName = c2.getName();
				String cookieValue = c2.getValue();
				
				out.print("<tr>\r\n" + 
						"			<td>"+cookieName+"</td>\r\n" + 
						"			<td>"+cookieValue+"</td>\r\n" + 
						" </tr>");
			}
			
			out.print("</table>\r\n" + 
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
