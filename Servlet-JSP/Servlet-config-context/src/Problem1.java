

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String text1,text2;
	ServletConfig config;
	ServletContext context;
	
	public void init() {
		config = getServletConfig();
		context = getServletContext();
		text1 = config.getInitParameter("text1");
		text2 = config.getInitParameter("text2");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.print("<html>\r\n" + 
				"    <head>\r\n" + 
				"        <title>Problem 1</title>\r\n" + 
				"    </head>\r\n" + 
				"    <body>\r\n");
		
		out.print("<h1>"+text1+"</h1>\r\n");
		out.print("<h1>"+text2+"</h1>\r\n");
		
		out.print("</body>\r\n" + 
				"</html>");
	}
}
