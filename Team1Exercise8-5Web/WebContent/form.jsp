<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="form" method="post">
Name: <input type="text" name="name" value=""><br>
Email: <input type="text" name="email" value=""><br>
Age: <select id="dropdown" name="age">
						<option value=""></option>
  						<option value="30">30</option>
 					    <option value="40" >40</option>
 					    <option value="50" >50</option>
  						<option value="60" >60</option>
 					    <option value="70" >70</option>
						</select><br>
<input type="submit" name="submit" value="submit" >
</form>
</body>
</html>