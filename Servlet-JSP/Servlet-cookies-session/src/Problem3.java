

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Problem3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	      HttpSession session = request.getSession(true);
	         
	      Date createTime = new Date(session.getCreationTime());
	      Date lastAccessTime = new Date(session.getLastAccessedTime());
	      
	      String title = "Welcome Back";
	      Integer visitCount = 0;
	      String visitCountKey = "visitCount";
	      String userIDKey = "userID";
	      String userID = "ABCD";

	      if (session.isNew()) {
	    	 
	         title = "Welcome 1st time";
	         session.setAttribute(userIDKey, userID);
	         
	      } 
	      else {
	    	  
	         visitCount = (Integer)session.getAttribute(visitCountKey);
	         visitCount = visitCount + 1;
	         userID = (String)session.getAttribute(userIDKey);
	      }
	      
	      session.setAttribute(visitCountKey,  visitCount);

	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();

	      out.println("<!DOCTYPE html>" +
	         "<html>\n" +
	            "<head><title>Problem 3</title></head>\n" +
	            
	            "<body>" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<h2 align = \"center\">Session Infomation</h2>\n" +
	               "<table border = \"1\" align = \"center\">\n" +
	                  
	                  "<tr bgcolor = \"#949494\">\n" +
	                     "  <th>Session info</th><th>value</th>" +
	                  "</tr>\n" +
	                     
	                  "<tr>\n" +
	                     "  <td>id</td>\n" +
	                     "  <td>" + session.getId() + "</td></tr>\n" +
	                  
	                  "<tr>\n" +
	                     "  <td>Creation Time</td>\n" +
	                     "  <td>" + createTime + "  </td></tr>\n" +
	                  
	                  "<tr>\n" +
	                     "  <td>Time of Last Access</td>\n" +
	                     "  <td>" + lastAccessTime + "  </td></tr>\n" +
	                  
	                  "<tr>\n" +
	                     "  <td>User ID</td>\n" +
	                     "  <td>" + userID + "  </td></tr>\n" +
	                  
	                  "<tr>\n" +
	                     "  <td>Number of visits</td>\n" +
	                     "  <td>" + visitCount + "</td></tr>\n" +
	               "</table>\n"); 
	      
	      out.print("<a href=\"Problem3\">Click here to reload page(current session)</a><br><br>");  
	      out.print("<a href=\"deleteSession\">Click here to terminate current session</a>");        
	            
	      out.print("</body></html>");
	 
	      out.close();
	     
	}
}
