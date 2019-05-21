<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="dk.email.data.Student"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<title>Table</title>
	<link type="text/css" rel="stylesheet" href="css/Email.css">
</head>
<body>

<form action="output" method="post">

<table class="myTable" border="1">
	

	<% 
 	HttpSession ses = request.getSession(true);
	 ArrayList<Student> list = (ArrayList<Student>) ses.getAttribute("Userlist");
	 
 
	 if (list != null) { 
 	%>
   
<tr class="tr1">
	<th>ID<th>
	<th>Name</th>
	<th>Age</th>
	<th>Email</th>
	<th>Delete</th>
</tr>

  	<% 
  	for (Student s: list) { 
  	%> 
  
<tr class="tr2">
	
		<th> <%=s.getId() %><th>
		<th> <%=s.getEmail()%></th>
		<th> <%=s.getAge()%></th>
		 <th><a href="Input"> <%=s.getName() %></a></th>
		<th><form action="Delete" method="post">
		
		<input type="submit" name="delete" value="Delete">
		<input type="hidden" name="id" value="<%=s.getId()%>" />
		</form></th>
</tr>
	<%}%>
</table>
 
<% 
 } 
%> 

</form>
</body>

</html>