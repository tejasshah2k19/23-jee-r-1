package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// valid

		// email -> cookie store
		Cookie c = new Cookie("email", email); // create cookie
		
		c.setMaxAge(60*60*24*7);// 7 days 
		response.addCookie(c); // add cookie into browser
								//cookie will expire after 1 year 
		
		// navigate home
		response.sendRedirect("CHome.jsp");

	}

}
