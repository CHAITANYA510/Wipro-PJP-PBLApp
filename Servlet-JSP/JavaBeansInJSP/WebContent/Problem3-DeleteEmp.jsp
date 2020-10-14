<jsp:useBean id="employee" class="jspbean.Problem3Bean"></jsp:useBean>

<jsp:setProperty name="employee" property="ID" value='<%= Integer.parseInt(request.getParameter("ID"))%>'/>

<% request.setAttribute("empobj", employee); %>

<jsp:forward page="Problem3DeleteEmployee"/>

	

