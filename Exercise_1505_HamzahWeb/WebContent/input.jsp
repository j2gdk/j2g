<%@page import="dk.Hamzah.Servlet.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Join Us</title>
</head>

<body>
<h1>Udfyld nedenstående felter</h1>

<%
	Student inputStudent = (Student) request.getAttribute("inputStudent");
	String action = "Input";
	if (inputStudent.getId()!= null) {
		action = "Update";
	}
%>

<form action="<%=action%>" method="post">
<%
if (inputStudent.getId() != null) {
%>
	<input type="hidden" name="id" value="<%=inputStudent.getId() %>" />
<%
}
%>
<table>
<tr>
<td> Email: <input type= "text" name="email" value="<%=inputStudent.getEmail() %>"></td>
</tr>

<tr>
<td> Names: <input type= "text"  name="name"	value="<%=inputStudent.getName() %>"></td>
</tr>

<tr>
<td>
		<select id="dropdown" name="age">
<option
					<% if (inputStudent.getAge().equals("20")){%>
						selected="selected"						
					<% }%>
					value="20">20</option>	
								
<option  
					<% if (inputStudent.getAge().equals("21")){%>
						selected="selected"						
					<% }%>
					value="21">21</option>	
								
<option  
					<% if (inputStudent.getAge().equals("22")){%>
						selected="selected"						
					<% }%>
					value="22">22</option>	
			
<option  
					<% if (inputStudent.getAge().equals("23")){%>
						selected="selected"						
					<% }%>
					value="23">23</option>	
<option  
					<% if (inputStudent.getAge().equals("24")){%>
						selected="selected"						
					<% }%>
					value="24">24</option>	
<option  
					<% if (inputStudent.getAge().equals("25")){%>
						selected="selected"						
					<% }%>
					value="25">25</option>		
</select><br></td>	
</tr>
<tr>
<%if (inputStudent.getId() == null) {%>
	<td><input type="submit" name="submit" value="Save Member"></td>
<%} else { %> 
	<td><input type="submit" name="Update" value="Update"></td>
<%} %>
</tr>
</table>
</form>
</body>
</html>