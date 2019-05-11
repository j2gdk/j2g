<%@page import="dk.form.data.Users"%>
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
<form action="output" method="post">
<%
 Users inputUsers = (Users) request.getAttribute("inputUsers");
%>

<% 
 HttpSession ses = request.getSession(true); 
 ArrayList<Users> list = (ArrayList<Users>) ses.getAttribute("userlist"); 
 
 if (list != null) { 
 %> 
   <table> 
  <tr> 
  	<td>Name</td>
  	<td>Email</td>
  	<td>Age</td>
    	
  </tr>
  <% 
  for (Users u: list) { 
  %> 
  
  
  <tr>	
  
   <td><%= u.getName() %></td> 
   <td><%= u.getEmail() %></td> 
   <td><%= u.getAge() %></td> 
   
  </tr> 
  <%  
  } 
  %> 
   </table> 
<% 
 } 
%> 
</form>
<p><input type="submit" name="previous" value="Previous"></p>
</body>
</html>
