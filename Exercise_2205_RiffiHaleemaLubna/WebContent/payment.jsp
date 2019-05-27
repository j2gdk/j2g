<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmed Order</title>
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
    <h1>Order Confirmed</h1>
    <br>
    We have received your order. <br>
    <br>
    Shortly you will receive a confirmation mail with delivery details. <br>
    <br>
    Thank you for shopping with us.
</section>

<footer>
  <p>We accept Visa <img width="50px" height="30px" src="images/business-debit-card.png"> , DK <img width="50px" height="30px" src="images/visa.jpg">and MobilPay.<img width="50px" height="30px" src="images/pay.jpg"></p>
</footer>


</body>
</html>