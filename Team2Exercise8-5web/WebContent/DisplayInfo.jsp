<%@page import="dk.email.data.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<title>Table</title>
	<link type="text/css" rel="stylesheet" href="css/Email.css">
</head>
<body>

<form action="infopersons" method="post">

<table class="myTable" border="1">


	<% 
 	HttpSession session2 = request.getSession(true); 
 	ArrayList<Person> list = (ArrayList<Person>) session2.getAttribute("NewEmailpersons"); 
 
	 if (list != null) { 
 	%> 
   
<tr class="tr1">
	<th>Email</th>
	<th>Name</th>
	<th>Age</th>
</tr>

  	<% 
  	for (Person a: list) { 
  	%> 
  
<tr class="tr2">
		<th> <%=a.getName() %></th>
		<th> <%=a.getEmail()%></th>
		<th> <%=a.getAge()%></th>
</tr>
	<%}%>
</table>
 
<% 
 } 
%> 
<br>
<input type="submit" name="previous" value="Previous">
</form>
</body>


</html>