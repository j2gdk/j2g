<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link type="text/css" rel="stylesheet" href="css/User.css">

</head>
<body  class="myBody">

<h1 class="h1">Form for User!</h1>

<form action="Form" method="post">
<table  class="myTable1">
<tr>
<td class="myTdNames">Name: <input type="text" name="name" value="" autocomplete="off"><br></td>
</tr>

<tr>
<td class="myTdNames">Email: <input type="text" name="email" value="" autocomplete="off"><br></td>
</tr>

<tr>
<td class="myTdNames">Age: <select id="dropdown" name="age">
						<option value=""></option>
						<option value="20">20</option>
  						<option value="30">30</option>
 					    <option value="40" >40</option>
 					    <option value="50" >50</option>
  						<option value="60" >60</option>
 					    <option value="70" >70</option>
						</select><br></td>
</tr>

<tr>
	<td><p class="myP"><input type="submit" name="submit" value="Opret"/></p></td>
</tr>
</table>
</form>
</body>
</html>