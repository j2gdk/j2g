<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<form action="Input" method="post">


Name: <input type="text" name="name" value=""><br><br> 

Email: <input type="text" name="email" value=""><br><br> 

Age: <select id="dropdown" name="age">
						<option value=""></option>
						<option value="15">15</option>
  						<option value="20">20</option>
  						<option value="25" >25</option>
 					    <option value="30" >30</option>
 					    <option value="35" >35</option>
  						<option value="40" >40</option>
						</select><br><br>

	<td><input type="submit" name="submit" value="Create"/></td>
<br>
	<td><input type="reset" value="Reset"/></td>
<br> 
	<td><input type="submit" name="submit" value="Update"/></td>


</form>
</table>
</body>
</html>