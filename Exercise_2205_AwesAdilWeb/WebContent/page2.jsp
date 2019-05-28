<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="dk.cars.data.cars"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="basket" method="post">	
<h1><%=request.getAttribute("name") %></h1>
<h1><%=request.getAttribute("price") %></h1>
<input type="text" name="count">
<input type="hidden" name="carid" value="<%=request.getAttribute("id") %>" >
<input type="submit" name="add" value="ADD TO BASKET">
</form>



</body>
</html>