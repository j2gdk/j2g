<%@page import="dk.form.data.Users"%>
<%@page import="java.util.ArrayList"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link type="text/css" rel="stylesheet" href="css/User.css">

</head>
<body class="myBody">

<h1 class="h1">Results for User!</h1>

<form action="Output" method="post">

<table class="myTable2">

<%
 Users inputUsers = (Users) request.getAttribute("inputUsers");
%>

<% 
 HttpSession ses = request.getSession(true); 
 ArrayList<Users> list = (ArrayList<Users>) ses.getAttribute("userlist"); 
 
 if (list != null) { 
 %> 
   
<tr>
	<th class="myTh1" class="myTh2">Name</th>
	<th class="myTh1" class="myTh2">Email</th>
	<th class="myTh1" class="myTh2">Age</th>
</tr>

  <% 
  for (Users u: list) { 
  %> 
  
<tr>
		<th class="myTh2"> <%=u.getName() %></th>
		<th class="myTh2"> <%=u.getEmail()%></th>
		<th class="myTh2"> <%=u.getAge()%></th>
</tr>
	<%}%>
</table>
 
<% 
 } 
%> 
<p class="myP"><input type="submit" name="previous" value="Previous"></p>
</form>
</body>
</html>
