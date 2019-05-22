<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="dk.Hamzah.Servlet.Student"%> 
<%@page import="java.util.ArrayList"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h1>Ramadaan Kareem Broor</h1>

	
 <% 
 HttpSession ses = request.getSession(true); 
 ArrayList<Student> list = (ArrayList<Student>) ses.getAttribute("studentlist");  
 
 if (list != null) { 
 %> 
   <table class="myTable">
  <tr>
  	<td><b>Id</b></td>
   	<td><b>Email</b></td>
   	<td><b>Navn</b></td>
   	<td><b>Alder</b></td>
   	
  </tr>
  <% 
  for (Student s : list) { 
  %> 
  <tr> 
  <td><%= s.getId() %></td> 
   <td><%= s.getEmail() %></td> 
   <td><a href="Input"><%= s.getName() %> </a></td>
   <td><%= s.getAge() %></td>
   <td>
    <form action="Delete" method="post">
        <input type="submit" name="delete_Id" value="Delete" />
        <input type="hidden" name="Id" value="<%=s.getId()%>" />
	 </form>
	 
     <form action="Update" method="post">
        <input type="submit" name="update_Id" value="Update" />
        <input type="hidden" name="Id" value="<%=s.getId()%>" />
    </form>
</td>
  </tr> 
  <%  
  } 
  %> 
   </table> 
<% 
 } 
%> 
<form action="outprint" method="post">
<p class="myP"><input type="submit" name="previous" value="Previous"></p>
</body>
</html>