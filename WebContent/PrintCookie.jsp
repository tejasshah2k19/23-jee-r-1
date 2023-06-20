<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Cookie c[] = 	(Cookie[])request.getAttribute("c");
	%>

	<%for(Cookie x:c){ %>
		<%=x.getName() %> :: <%=x.getValue() %><br>
	
	<%} %>
	
	<br><Br>
	
	<form action="DeleteCookieServlet">
	
	
		Enter Cookie Name That you want to remove :: <input type="text" name="cname"/>
		
		<input type="submit" value="Delete Cookie"/>
	</form>
</body>
</html>