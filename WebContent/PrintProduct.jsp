<%@page import="com.bean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print Product</title>
</head>
<body>

	<%
		ProductBean product = (ProductBean) request.getAttribute("product");
	%>

	Name :
	<%=product.getName()%><br>
	<br> Price :
	<%=product.getPrice()%><br>
	<br> Qty :
	<%=product.getQty()%><br>
	<Br> Category :
	<%=product.getCategory()%>
</body>
</html>