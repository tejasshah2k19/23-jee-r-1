<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>



	<form method="post" action="CLoginServlet">

		<BR> Email : <input type="text" name="email" /> <br>
		<BR> Password : <input type="text" name="password" /> <br>
		<br> <input type="submit" value="Login" />
	</form>
</body>
</html>