

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.print("<html>\r\n" + 
				"    <head>\r\n" + 
				"        <title>Problem 1</title>\r\n" + 
				"    </head>\r\n" + 
				"    <body>\r\n" +
				"       <h1>Header Information</h1>\r\n" + 
				"		<table>\r\n");
		
		Enumeration<String> header = request.getHeaderNames();
		
		while(header.hasMoreElements()) {
			
			String name = (String)header.nextElement();
			String value = response.getHeader(name);
			
			out.print("<tr>\r\n" + 
					"        <td>"+name+"</td>\r\n" + 
					"        <td>"+value+"</td>\r\n" + 
					"    </tr>\r\n");	
		}
		
		out.print("</table>" +
				"	</body>\r\n" + 
				"</html>");
	}

}
