<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddCookieServlet" method="post">
		CookieName :  <input type="text" name="cname"/><Br><Br>
		CookieValue :  <input type="text" name="cvalue"/><br><br>
		
		<input type="submit" value="AddCookie"/>
	</form>
	<br>
	<a href="PrintCookieServlet">Print Cookie</a>
</body>
</html>