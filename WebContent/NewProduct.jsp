<%@page import="com.bean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>

	<%
		String nameError = (String) request.getAttribute("nameError");

		String categoryError = (String) request.getAttribute("categoryError");
		ProductBean product = (ProductBean) request.getAttribute("product");
	%>



	<form action="SaveProductServlet" method="post">
		Name : <input type="text" name="name"
			value="<%=product == null? "" : product.getName()%>" />
		<%=nameError == null ? "" : nameError%>
		<br> <br> Price : <input type="number" name="price" /><br>
		<br> Qty : <input type="number" name="qty" /><br> <br>
		Category : <input type="text" name="category"
			value="<%=product == null ? "" : product.getCategory()%>" />
		<%=categoryError == null ? "" : categoryError%>
		<br> <br> <input type="submit" value="SaveProduct" />
	</form>

</body>
</html>