<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="tabel" method="post">

Firstname: <input type= "text" name="firstname" value="">
<br>
<br>
Lastname: <input type= "text"  name="lastname"	value="">
<br>
<br>
Gender:<input type="radio" name="gender" value="Male"> Male
	<input type="radio" name="gender" value="Female"> Female
<br>
<br>
<input type="submit" name="create" value="Create">
</form>
</body>
</html>