

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie name = new Cookie("name", request.getParameter("name"));
        Cookie number = new Cookie("number", request.getParameter("number"));
 
        response.addCookie(name);
        response.addCookie(number);
 
        response.setContentType("text/html");
 
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>\r\n" + 
        		"<html>\r\n" + 
        		"<head>\r\n" + 
        		"<meta charset=\"ISO-8859-1\">\r\n" + 
        		"<title>Problem 2</title>\r\n" + 
        		"</head>\r\n" + 
        		"<body>\r\n" + 
        		"	<h1>Cookie submitted!!</h1>\r\n" + 
        		"	<h2><a href=\"displayServlet\">Display cookie</a></h2>\r\n" + 
        		"	<h2><a href=\"deleteServlet\">Delete cookie</a></h2>\r\n" + 
        		"</body>\r\n" + 
        		"</html>");
        
        out.close();
		
	}

}
