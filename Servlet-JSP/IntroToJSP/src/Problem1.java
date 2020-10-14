

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Problem1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("number"));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int start = 2;
		
		if(num <= start) {
			list = null;
		}
		else {
			int toCheck = 2;
			boolean isPrime = true;
			
			while(toCheck < num) {
				for(int i=2;i<=toCheck/2;i++) {
					if(toCheck%i==0) {
						isPrime = false;
					}
				}
				if(isPrime) {
					
					list.add(toCheck);
				}
				isPrime = true;
				toCheck++;
			}
			
		}
	          
		request.setAttribute("listOfPrimes",list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Problem1.jsp");          
		dispatcher.forward(request, response);
		
	}

}
