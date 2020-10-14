

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"    <head>\r\n" + 
				"        <title>Demo servlet</title>\r\n" + 
				"    </head>\r\n" + 
				"    <body>\r\n" + 
				"        <h1>My First servlet program.</h1>\r\n" + 
				"    </body>\r\n" + 
				"</html>");
	}

}
