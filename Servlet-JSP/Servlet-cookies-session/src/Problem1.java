

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


public class Problem1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			Cookie c2 = cookies[0];
			String cookieName = c2.getName();
			String cookieValue = c2.getValue();
			
			out.print("Welcome back");
			out.print("<br>");
			out.print("Cookie name is "+cookieName+" value is "+cookieValue);
		}
		else {
			
			String user = request.getParameter("name");
			Cookie c1 = new Cookie("user",user);
			response.addCookie(c1);
			
			out.print("Welcome you are visiting this website 1st time");
			out.print("<br>");
			out.print("Cookie added");
		}
		
		out.close();
		
	}
}
