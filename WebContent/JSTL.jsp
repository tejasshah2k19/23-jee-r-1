<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.data {
	color: red;
}
</style>
</head>
<body>
 
 	

	<c:set var="x" value="10"></c:set>
	<span class="data"> <c:out value="${x}"></c:out>
	</span>
	<c:if test="${x % 2 == 0 }">
	EVEN
	</c:if>


	<br>
	<Br>
	<c:forEach var="i" begin="1" end="10" step="1">
		${i} <bR>
	</c:forEach>

	<c:set var="str" value="jan,feb,march"></c:set>

	<c:forTokens items="${str}" delims="," var="x">
 		${x }<Br>
	</c:forTokens>






</body>

</html>