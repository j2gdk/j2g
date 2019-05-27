<%@page import="dk.shop.ProductData"%>
<%@page import="dk.shop.product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: black;
  padding: 1px;
  text-align: center;
  font-size: 35px;
  color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 30%;
  height: 350px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 323px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: black;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
  
}
</style>
</head>
<body>

<header>
  <h2><img align="middle" width="700px" height="140px" src="images/logo.jpg"></h2>
  <p>We are giving free delivery until 30th May, so Hurry and order !!!!</p>
</header>

<form action="basket" method="post">					
<table width="100%">
<tr>
<td><b><img class="img" width="300px" height="300px" style="border:10px solid white" src="<%=request.getAttribute("image")%>" align="left"> </b><br><b><%=request.getAttribute("name")%> </b> <br><%=request.getAttribute("description") %><br><br> DKK <%=request.getAttribute("price") %> 
<br><select name="count" value="<%=request.getParameter("count")%>">
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
		</select>

	<br><br><br><br><br><br>
		<input type="submit" name="previous" value="PREVIOUS">
		<input type="submit" name="add" value="ADD TO BASKET">
		<input type="Hidden" name="Id" value="<%=request.getParameter("id")%>">
</td>
</tr>
</table>
</form>

</section>

<footer>
  <p>We accept Visa <img width="50px" height="30px" src="images/business-debit-card.png"> , DK <img width="50px" height="30px" src="images/visa.jpg">and MobilePay.<img width="50px" height="30px" src="images/pay.jpg"></p>
</footer>


</body>
</html>