<%@page import="dk.delete.data.Customer"%>
<%@page import="java.util.ArrayList"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table width= "80%" border="1px" align="center">

<%
 Customer inputUsers = (Customer) request.getAttribute("inputCustomer");
%>

<% 
 HttpSession ses = request.getSession(true); 
 ArrayList<Customer> list = (ArrayList<Customer>) ses.getAttribute("customerlist"); 
 
 if (list != null) { 
 %> 
   
<tr>
    <th>ID</th>
	<th>Name</th>
	<th>Email</th>
	<th>Age</th>
	<th colspan="2">Options</th>
	
</tr>

  <% 
  for (Customer g : list) { 
  %> 
  
<tr>
		<th> <%=g.getId() %></th>
		<th><a href="InputServlet?id=<%=g.getId()%>"> <%=g.getName() %></a></th>
		<th> <%=g.getEmail()%></th>
		<th> <%=g.getAge()%></th>
		
	
		
<form action="DeleteServlet" method="post">
		<th><input type="submit" name="delete" value="Delete">
		<input type="Hidden" name="id" value="<%=g.getId() %>"></th>
</form>
			
</tr>
	<%}%>
</table>
 
<% 
 } 
%> 
<br>
<form action="InputServlet" method="get">
		<input type="submit" name="Add New Member" value="Add New Member">
</form>
</body>
</html>
