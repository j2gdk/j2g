<%@page import="dk.ID.data.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Page</title>
</head>
<body>
<%
	Person inputPerson = (Person) request.getAttribute("inputPerson");
	String action = "Form";
	if (inputPerson.getId() != null) {
		action = "Update";
	}
%>

<form action="form" method="post">
<table>

Name: <input type="text" name="name" value=""><br><br> 

Email: <input type="text" name="email" value=""><br><br>

Age: <select id="dropdown" name="age">
						<option 
							<% if (inputPerson.getAge().equals("16")){%>
							selected="selected"						
							<% }%>
						value="16">16</option>
						
  						<option value="17">17</option>
 					    <option value="18">18</option>
 					    <option value="19">19</option>
  						<option value="20">20</option>
  						<option value="21">21</option>
						<option value="22">22</option>
  						<option value="23">23</option>
 					    <option value="24">24</option>
 					    <option value="25">25</option>
						</select><br><br>

<tr>
<%if (inputPerson.getId() == null) {%>
	<td><p class="myP"><input type="submit" name="submit" value="Save Employee"/></p></td>
<%} else { %> 
	<td><p class="myP"><input type="submit" name="Update" value="Update"></p></td>
<%} %>
</table>
</form>
</body>


</body>
</html>