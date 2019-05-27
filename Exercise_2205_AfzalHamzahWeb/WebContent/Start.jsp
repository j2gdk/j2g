<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="dk.shop.servlet.Mobile"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobilshop</title>
</head>

<table border="1" align="center">
<h1 align="center">Mobil Shop</h1>
<tr>
	<td><img width= "220px" height="220px" src="https://img.us.news.samsung.com/us/wp-content/uploads/2017/03/29150006/S8Plus_S8_Silver_LockUp_rgb.jpg">
		<h2 align="center"> <a href="product?id=1"><%=new Mobile().mobile1 %> </a> </h2>
		<h3 align="center">6299Dkk</h3>
		<h6>Ved køb over 2 sælges til normalpris 7999dkk</h6>
	</td>
		
	<td><img width= "220px" height="220px" src="https://teleboxen.dk/media/1814/iphone-xr-hvid.jpeg?anchor=center&mode=crop&width=500&height=500&rnd=131850309110000000.jpg">
		<h2 align="center"> <a href="product?id=2"><%=new Mobile().mobile2 %> </a> </h2>
		<h3 align="center">6599Dkk</h3>
		<h6>Ved køb over 2 sælges til normalpris 8499dkk</h6>
	</td>		
	
	<td><img width= "220px" height="220px" src="https://cdn.techjuice.pk/wp-content/uploads/2017/06/BlackBerry-Q10.png">	
		<h2 align="center"> <a href="product?id=3"><%=new Mobile().mobile3 %> </a> </h2>
		<h3 align="center">6499Dkk</h3>
		<h6>Ved køb over 2 sælges til normalpris 8199dkk</h6>
	</td>		
</tr>
		
</table>
<body>

</body>
</html>