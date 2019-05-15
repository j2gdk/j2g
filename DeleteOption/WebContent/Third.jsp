<%@page import="dk.delete.data.Customer"%>
<%@page import="java.util.ArrayList"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%response.sendRedirect("third");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="thirdservlet" method="post">

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
	<th>Firstname</th>
	<th>Lastname</th>
	<th>Gender</th>
	<th>Option</th>
	
</tr>

  <% 
  for (Customer g : list) { 
  %> 
  
<tr>
		<th> <%=g.getId() %></th>
		<th> <%=g.getFirstname() %></th>
		<th> <%=g.getLastname()%></th>
		<th> <%=g.getGender()%></th>
		<th><input type="submit" name="delete" value="Delete"></th>

</tr>
	<%}%>
</table>
 
<% 
 } 
%> 
</form>
</body>
</html>
