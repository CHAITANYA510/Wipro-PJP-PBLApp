<jsp:useBean id="bidder" class="bean.BidderBean"></jsp:useBean>

<jsp:setProperty name="bidder" property="ID" value='<%= Integer.parseInt(request.getParameter("ID"))%>'/>
<jsp:setProperty name="bidder" property="itemname" value='<%= request.getParameter("itemname")%>'/>
<jsp:setProperty name="bidder" property="name" value='<%= request.getParameter("name")%>'/>
<jsp:setProperty name="bidder" property="email" value='<%= request.getParameter("email")%>'/>
<jsp:setProperty name="bidder" property="amount" value='<%= Float.parseFloat(request.getParameter("amount"))%>'/>
<% 
	boolean autobidders = false;
	if(request.getParameter("autobidders") == "on"){
		autobidders = true;
	}
%>
<jsp:setProperty name="bidder" property="autobidders" value='autobidders'/>

<% request.setAttribute("bidderobj", bidder); %>

<jsp:forward page="DataCollectionServlet"/>

	

