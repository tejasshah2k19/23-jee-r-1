<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="MyError.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int num1 = 10;
		int num2=0;
		int ans = num1 / num2; //ArithmeticException 
	%>
	
	<%=ans %>
	
</body>
</html>