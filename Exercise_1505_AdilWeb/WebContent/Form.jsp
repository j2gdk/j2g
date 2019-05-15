<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Page</title>
</head>
<body>
<body>

<form action="createperson" method="post">


Name: <input type="text" name="name" value=""><br><br> <!--  autocomplete="off" -->

Email: <input type="email" name="email" value=""><br><br> <!--  autocomplete="off" -->

Age: <select id="dropdown" name="age">
						<option value=""></option>
						<option value="15">15</option>
  						<option value="20">20</option>
 					    <option value="30" >30</option>
 					    <option value="40" >40</option>
  						<option value="50" >50</option>
						</select><br><br>

<input type="submit" name="submit" value="Opret"/>

</table>
</form>
</body>


</body>
</html>