<%@page import="dk.form.data.Users"%>
<%@page import="java.util.ArrayList"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User information</title>

<link type="text/css" rel="stylesheet" href="css/User.css">

</head>
<body >
<br>
<br>



<%
	Users inputUsers = (Users) request.getAttribute("inputUsers");
	String action = "Form";
	if (inputUsers.getId() != null) {
		action = "Update";
	}
%>

<form class="myForm" action="<%=action%>" method="post">

    <fieldset class="field1">
    <legend class="legendfont"><b>Please enter your User Information: </b></legend>
<%
if (inputUsers.getId() != null) {
%>
	<input type="hidden" name="id" value="<%=inputUsers.getId() %>" />
<%
}
%>
<table  class="myTable1">
<tr>
<td class="myTdNames">Name: <input class="input" type="text" name="name" value="<%=inputUsers.getName() %>" autocomplete="off"><br></td>
</tr>

<tr>
<td class="myTdNames">Email: <input class="input" type="text" name="email" value="<%=inputUsers.getEmail() %>" autocomplete="off"><br></td>
</tr>

<tr>
<td class="myTdNames">Age: <select class="select" id="dropdown" name="age">
			
					  <option  

					<% if (inputUsers.getAge().equals("16")){%>

						selected="selected"						

					<% }%>

					value="16">16</option>	

								

				<option  

					<% if (inputUsers.getAge().equals("17")){%>						

						selected="selected"						

					<% }%>

					value="17">17</option>	

					

				<option  

					<% if (inputUsers.getAge().equals("18")){%>						

						selected="selected"						

					<% }%>

					value="18">18</option>

					

				<option  

					<% if (inputUsers.getAge().equals("19")){%>						

						selected="selected"						

					<% }%>

					value="19">19</option>	

					

				<option  

					<% if (inputUsers.getAge().equals("20")){%>						

						selected="selected"						

					<% }%>

					value="20">20</option>

					

				<option  

					<% if (inputUsers.getAge().equals("30")){%>						

						selected="selected"						

					<% }%>

					value="30">30</option>

					

				<option  

					<% if (inputUsers.getAge().equals("40")){%>						

						selected="selected"						

					<% }%>

					value="40">40</option>	
 					    
						</select><br></td>
</tr>

<tr>
<%if (inputUsers.getId() == null) {%>
	<td><p class="myP"><input class="submit" type="submit" name="submit" value="Create User"/></p></td>
<%} else { %> 
	<td><p class="myP"><input class="submit" type="submit" name="submit" value="Update User"/></p></td>
<%} %>
</tr>
</table>
</form>
</fieldset>
</body>
</html>