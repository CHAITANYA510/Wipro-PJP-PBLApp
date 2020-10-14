<jsp:useBean id="employee" class="jspbean.Problem3Bean"></jsp:useBean>

<jsp:setProperty name="employee" property="name" value='<%= request.getParameter("name")%>'/>
<jsp:setProperty name="employee" property="ID" value='<%= Integer.parseInt(request.getParameter("ID"))%>'/>
<jsp:setProperty name="employee" property="designation" value='<%= request.getParameter("designation")%>'/>

<% request.setAttribute("empobj", employee); %>

<jsp:forward page="Problem3AddEmployee"/>

	

