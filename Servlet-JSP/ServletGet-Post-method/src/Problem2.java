

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.print("<html>\r\n" + 
				"    <head>\r\n" + 
				"        <title>Problem 2</title>\r\n" + 
				"    </head>\r\n" + 
				"    <body>\r\n" +
				"       <h1>Form Data</h1>\r\n" + 
				"		<table border=1>\r\n");
		
		Enumeration<String> values = request.getParameterNames();
		
		while(values.hasMoreElements()) {
			
			String name = (String)values.nextElement();
			String[] value = request.getParameterValues(name);
			
			out.print("<tr>\r\n" + 
					"        <td>"+name+"</td>\r\n");	
			out.print("<td>\r\n");
			
			for(String s:value) {
				out.print(s+"<br>");	
			}
			
			out.print("</td></tr>\r\n");
		}
		
		out.print("</table>" +
				"	</body>\r\n" + 
				"</html>");
	}

}
