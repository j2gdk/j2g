<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="dk.team3exerise.servlet.Student"%> 
<%@page import="java.util.ArrayList"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ramadaan Kareem Broor</h1>


 <% 
 HttpSession ses = request.getSession(true); 
 ArrayList<Student> list = (ArrayList<Student>) ses.getAttribute("studentlist");  
 
 if (list != null) { 
 %> 
   <table class="myTable">
  <tr>
   	<td><b>Email</b></td>
   	<td><b>Navn</b></td>
   	<td><b>Alder</b></td>
  </tr>
  <% 
  for (Student s : list) { 
  %> 
  <tr> 
   <td><%= s.getEmail() %></td> 
   <td><%= s.getName() %></td>
   <td><%= s.getAge() %></td>
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