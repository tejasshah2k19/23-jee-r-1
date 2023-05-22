<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<%
	// this is an example of scriptlet 
	String firstNameError  =(String) request.getAttribute("firstNameError"); //if not present -> NULL
	String emailError  =(String) request.getAttribute("emailError"); //if not present -> NULL
	String passwordError  =(String) request.getAttribute("passwordError"); //if not present -> NULL
	String firstNameValue  =(String) request.getAttribute("firstNameValue"); //if not present -> NULL
	String emailValue  =(String) request.getAttribute("emailValue"); //if not present -> NULL
	
	

%>


<!--  this is form  -->

	<form method="post" action="RegistrationServlet">

		FirstName : <input type="text" name="firstName" value="<%=firstNameValue==null?"":firstNameValue %>" /> <%=firstNameError==null?"":firstNameError %>
		
		<br>
		
		
		<BR> Email : <input type="text" name="email" value="<%=emailValue==null?"":emailValue %>" /><%=emailError==null?"":emailError %>
		
		 <br>
		<BR> Password : <input type="text" name="password" /><%=passwordError==null?"":passwordError %> <br>
		<br> <input type="submit" value="Signup" />
	</form>
	<br>
	 
</body>
</html>