<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 3</title>
</head>
<body>
<table border="1" width="50%" align="center">
	<tr>
	<th>Item</th>
	<th>Item description</th>
	<th>Quantity</th>
	<th>Delete</th>
</tr>


<tr>
	<td></td>
	<td></td>
	
	<td><select id="dropdown" name="Quantity">
			 			 		<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									</select></td>
	
	<td><form action="" method="post">
	<input type="submit" name="Delete" value="Delete">
	</form></td>
</tr>

</table><br>

<div align="center">

	<form action="redirectstartpage" method="post">
	<input type="submit" name="startpage" value="Start page">
	</form>
	
	<form action="confirmation" method="post">
	<input type="submit" name="payment" value="Payment">
	</form>
	
</div>



</body>
</html>