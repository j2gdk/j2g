<%@page import="dk.shop.BasketItem"%>
<%@page import="dk.shop.ProductData"%>
<%@page import="java.util.ArrayList"%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

<section>
  <nav>
  <img width="300px" height="160px" src="images/makeup.jpg">
    <ul>
      <li><a href="#">Foundation</a></li>
      <li><a href="#">Nail Polish</a></li>
      <li><a href="#">Cream</a></li>
      <li><a href="#">Perfume</a></li>
      <li><a href="#">Eye Shadow</a></li>
    </ul>
  </nav>
  
  <article>
<h2><under>Shopping Basket</under></h2>
<br>

<table align="center" width="100%" cellpadding="5" cellspacing="5" align="center">

 <%	
 	ArrayList<BasketItem> list = (ArrayList<BasketItem>) request.getAttribute("basketlist"); 
	if (list != null) { 
 %>
		<tr>
			<td><b>Items</b></td>
			<td><b>Product Name</b></td>
			<td><b>Description</b></td>
			<td><b>Qty</b></td>
			<td><b>Availability</b></td>
			<td><b>Price</b></td>
			
		</tr>
		<% 
  for (BasketItem item: list) { 
  %>
		 <tr>	
   <td><%= item.getId() %></td>
   <td><%= item.getName() %></td> 
   <td><%= item.getDescription() %></td> 
   <td><form action="basket" method="post">
   <input type="text" name="count" value="<%=item.getQuantity()%>" size="1">
   <input type="submit" name="update" value="Update">
   <input type="Hidden" name="action" value="update">
   <input type="Hidden" name="Id" value="<%=item.getId()%>">
   </form></td>
   <td>
   <%if  (item.isInStock()) { %>
   		In stock
   <%} else { %>
   		<span style="color:red">Not in stock</span>
   <%}  %>
   </td> 
   <td><%= item.getTotalPrice()%> DKK</td> 
   <td>	
   	<form action="basket" method="post">
 		<input type="submit" name="delete" value="Delete">
		<input type="Hidden" name="action" value="delete">
		<input type="Hidden" name="Id" value="<%=item.getId()%>">
	</form>
   	</tr>
	<%}%>
	


</table>

<% 
 } 
%> 	
<br>

<form action="payment" method="post">
  			<input type="submit" name="continue" value="Continue Shopping">
  			<input type="submit" name="checkout" value="Go To Checkout">
</form>

</section>
	
<footer>
  <p>We accept Visa <img width="50px" height="30px" src="images/business-debit-card.png"> , DK <img width="50px" height="30px" src="images/visa.jpg">and MobilPay.<img width="50px" height="30px" src="images/pay.jpg"></p>
</footer>

</body>
</html>