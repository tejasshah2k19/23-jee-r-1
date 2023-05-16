<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>

	Hey this is my first JSP File.<br><br>
	<%
		int a=100;	
	%>	

	<%=a %>
	
	<br><br>
	
	 <%Date d = new Date(); %>
	 
	 <%=d %>	
	
</body>
</html>