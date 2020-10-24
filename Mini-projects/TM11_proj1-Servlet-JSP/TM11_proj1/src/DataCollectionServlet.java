

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BidderBean;

public class DataCollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BidderBean bidder = (BidderBean) request.getAttribute("bidderobj");
		
		//System.out.println(bidder.getAmount()+"::"+bidder.getEmail()+"::"+bidder.getID());
		//System.out.println(bidder.getItemname()+"::"+bidder.getName()+"::"+bidder.isAutobidders());
		
		request.setAttribute("displayBidder", bidder);
		
		RequestDispatcher rd = request.getRequestDispatcher("DataDisplayBean.jsp");
		rd.forward(request, response);
	}

}
