<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="dk.application.servlet.Student"%> 
<%@page import="java.util.ArrayList"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
 HttpSession ses = request.getSession(true); 
 ArrayList<Student> list = (ArrayList<Student>) ses.getAttribute("studentlist");  
 
 if (list != null) { 
 %> 
   <table border="1" class="myTable">
  <tr>
  	<td><b>ID</b></td>
   	<td><b>Firstname</b></td>
   	<td><b>Lastname</b></td>
   	<td><b>Gender</b></td>
  </tr>
  <% 
  for (Student s : list) { 
  %> 
  <tr>
  <td><%= s.getUniqueID()%></td>
   <td><%= s.getFirstName() %></td> 
   <td><%= s.getLastName() %></td>
   <td><%= s.getGender() %></td>
   <td> <input type="submit" name="remove" value="Delete"> </td>
  </tr> 
  <%  
  } 
  %> 
   </table> 
<% 
 } 
%> 
</body>
</html>