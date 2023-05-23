<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<%
		String firstNameValue = (String) request.getAttribute("firstNameValue");
		String emailValue = (String) request.getAttribute("emailValue");
	%>

	FirstName :
	<%=firstNameValue%>
	<Br>
	<BR> Email :
	<%=emailValue%>
	<BR>
	<BR>
	<hr>

	<%
		UserBean user = (UserBean) request.getAttribute("user");
	%>
	<br> FirstName :
	<%=user.getFirstName()%>
	<Br>
	<BR> Email :
	<%=user.getEmail()%>
	<BR>
	<BR>



</body>
</html>