<%@page import="dk.shop.ProductData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shop</title>
</head>
<body>
<h1> <img align="middle" width="700px" height="140px" src="images/logo.jpg"></h1>


<table align="center" width="100%">
<tr>
	<td><img width="100px" height="300px" src="images/product1.jpg">
	<h1><a href="product?id=1"><%=new ProductData().product1Name %></a></h1>
	<%=new ProductData().product1Description%>
	<br>Price: <%=new ProductData().product1Price %> Kr</td>
	
	<td><img width="300px" height="300px" src="images/product2.jpg">
	<h1><a href="product?id=2"><%=new ProductData().product2Name %></a></h1>
	<%=new ProductData().product2Description %>
	<br>Price: <%=new ProductData().product2Price %> Kr</td>
	
	<td><img width="300px" height="300px" src="images/product3.jpg">
	<h1><a href="product?id=3"><%=new ProductData().product3Name %></a></h1>
	<%=new ProductData().product3Description %>
	<br>Price: <%=new ProductData().product3Price %> Kr</td>
	
</tr>
</table>

</body>
</html>