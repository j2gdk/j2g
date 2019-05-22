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
	<% Customer inputCustomer = (Customer) request.getAttribute("inputCustomer");%>

		<form method="post" action="InputServlet" class="input">
			<% if (request.getAttribute("error_name")!=null) { %>	

			<td><%=request.getAttribute("error_name") %></td>	
	
				<%} %><br>
				
				Name: <input type="text" name="name" value="<%=inputCustomer.getName()%>"><br><br>

				<%if (request.getAttribute("error_email")!=null){ %>

			<td><%=request.getAttribute("error_email") %></td><br>
				<%} %>

				Email:  <input type="text" name="email" value="<%=inputCustomer.getEmail()%>" ><br><br>
				
				<%if (request.getAttribute("error_age")!=null){ %>

			<td><%=request.getAttribute("error_age") %></td><br>
				<%} %>
					Age:				
					<tr>
						<td>		<select id="dropdown" name="age">
									<option value=""></option>
									<option value="10">10</option>
  									<option value="20">20</option>
 					    			<option value="30">30</option>
 					    			<option value="40">40</option>
  									<option value="50">50</option>
 					    			<option value="60">60</option>
									</select>
						</td><br>
					</tr><br>		   
		  							<input type="submit" name="submit" value="Create">
</form>
</body>
</html>