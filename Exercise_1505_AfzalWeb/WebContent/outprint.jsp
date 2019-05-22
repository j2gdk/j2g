<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="dk.exercise_1505_AfzalWeb.servlet.Student"%> 
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
   <table class="myTable" border=1>
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
   <td><%=s.getId() %></td>
   <td><%=s.getEmail() %></td> 
   <td><a href="Update"> <%=s.getName() %></a></td>
   <td><%=s.getAge() %></td>
   <td><form action="Delete" method="post">
        <input type="submit" name="delete_Id" value="Delete" />
        <input type="hidden" name="id" value="<%=s.getId()%>" />
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
<form action="Input" method="doGet">
        <input type="submit" name="previous" value="Previous" />
    </form>
</body>
</html>