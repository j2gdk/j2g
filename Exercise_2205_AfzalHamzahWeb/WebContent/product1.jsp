<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><%=request.getAttribute("Name")%></h3><b></b><p><%=request.getAttribute("Description")%></p>

<input id="amount" class="TextInputField" type="number" name="AMOUNT" minlength="1" size="3" maxlength="6" value="1">
</body>
</html>