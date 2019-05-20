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

<form action="form" method="post">


Name: <input type="text" name="name" value=""><br><br> 

Email: <input type="text" name="email" value=""><br><br>

Age: <select id="dropdown" name="age">
						<option value=""></option>
						<option value="16">16</option>
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

<input type="submit" name="submit" value="Create"/>

</table>
</form>
</body>


</body>
</html>