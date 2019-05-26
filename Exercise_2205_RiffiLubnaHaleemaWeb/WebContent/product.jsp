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
					
<table align="center" width="100%">
<tr>
	<td><img width="120px" height="120px" src="images/product1.jpg"></td>
	<td><img width="120px" height="120px" src="images/product2.jpg"></td>
	<td><img width="120px" height="120px" src="images/product3.jpg"></td>
</tr>

<tr>
<td><b><%=request.getAttribute("name")%> </b></td>
</tr>

<tr>
<td><%=request.getAttribute("description") %></td>
</tr>

<tr>
<td><br> DKK <%=request.getAttribute("price") %> 
<br><br><select name="antal">
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
</tr>
</table>

<form action="product" method="post" align="center">
<input type="submit" name="previous" value="PREVIOUS">
<input type="submit" name="add" value="ADD TO BASKET">
</form>

</section>

<footer>
  <p>We accept Visa <img width="50px" height="30px" src="images/business-debit-card.png"> , DK <img width="50px" height="30px" src="images/visa.jpg">and MobilePay.<img width="50px" height="30px" src="images/pay.jpg"></p>
</footer>


</body>
</html>