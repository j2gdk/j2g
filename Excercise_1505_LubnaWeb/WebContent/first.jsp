<%@page import="dk.delete.data.Customer"%>
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
	
<%
	Customer inputCustomer = (Customer) request.getAttribute("inputCustomer");
	String action = "InputServlet";
	if (inputCustomer.getId() !=null) {
		action = "Update";
	}
%>
		<form method="post" action="<%=action%>" >
<%
if (inputCustomer.getId() !=null) {
%>
	<input type="hidden" name="id" value="<%=inputCustomer.getId() %>" />
<%
}
%>
	<% if (request.getAttribute("error_name")!=null) { %>	

	<input type="hidden" name="id" value="<%=inputCustomer.getId() %>" />

<%}%>
<table>
<tr>
			<td><%=request.getAttribute("error_name") %></td>	
	
				
				
				Name: <input type="text" name="name" value="<%=inputCustomer.getName()%>"><br><br>

				<%if (request.getAttribute("error_email")!=null){ %>
</tr>
			<td><%=request.getAttribute("error_email") %></td><br>
				<%} %>

				Email:  <input type="text" name="email" value="<%=inputCustomer.getEmail()%>" ><br><br>
				
				<%if (request.getAttribute("error_age")!=null){ %>

			<td><%=request.getAttribute("error_age") %></td><br>
				<%} %>
					Age:<select id="dropdown" name="age">
									<option value=""></option>
						 <option  

					<% if (inputCustomer.getAge().equals("10")){%>

						selected="selected"						

					<% }%>

					value="10">10</option>
									
						<option  

					<% if (inputCustomer.getAge().equals("20")){%>

						selected="selected"						

					<% }%>

					value="20">20</option>
									
									<option  

					<% if (inputCustomer.getAge().equals("30")){%>

						selected="selected"						

					<% }%>

					value="30">30</option>
									
									<option  

					<% if (inputCustomer.getAge().equals("40")){%>

						selected="selected"						

					<% }%>

					value="40">40</option>
									
									<option  

					<% if (inputCustomer.getAge().equals("50")){%>

						selected="selected"						

					<% }%>

					value="50">50</option>
									
									<option  

					<% if (inputCustomer.getAge().equals("60")){%>

						selected="selected"						

					<% }%>

					value="60">60</option>
									
									<option > 

												
									</select>
						</td><br>
					<tr>

<%if (inputCustomer.getId()== null) {%>

	<td><p><input class="submit" type="submit" name="submit" value="Create User"/></p></td>

<%} else { %> 

	<td><p><input class="submit" type="submit" name="submit" value="Update User"/></p></td>

<%}%>

</tr>
</table>
</form>
</body>
</html>