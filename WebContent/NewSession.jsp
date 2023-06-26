<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SaveSessionServlet" method="post">
	Name :  <input type="text" name="name"/><br><br>
	Value : <input type="text" name="value"/><br><br>
	
	<input type="submit" value="Save"/>
	
</form>
<br><Br>
	
	<a href="PrintSessionData.jsp">Print Data</a>
	
</body>
</html>