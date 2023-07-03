<%@page import="java.util.Date"%>
<%
	Date d = new Date();

	int h = d.getHours(); // 24 

	if (h >= 0 && h <= 11) {
		out.print("Good Morning");
	} else if (h >= 12 && h <= 17) {
		out.print("Good AfterNoon");
	} else {
		out.print("Good Evening");
	}
%>

