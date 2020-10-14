package jspbean;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("number"));
		RequestDispatcher dispatcher;
		
		if(num<10) {
			dispatcher = request.getRequestDispatcher("Problem2-page1.jsp");          
			dispatcher.forward(request, response);
		}
		else if(num>=10 && num<=99) {
			dispatcher = request.getRequestDispatcher("Problem2-page2.jsp");          
			dispatcher.forward(request, response);
		}
		else {
			dispatcher = request.getRequestDispatcher("Problem2-page3.jsp");          
			dispatcher.forward(request, response);
		}
	}

}
