package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@  //web.xml 
public class InitLoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    
		ServletConfig config = getServletConfig();
		ServletContext context = request.getServletContext();
		

		String gEmail = context.getInitParameter("email");
		System.out.println("Global => "+gEmail);
		
		String cEmail = config.getInitParameter("email");
		String cPassword = config.getInitParameter("password");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (email.equals(cEmail) && password.equals(cPassword)) {
			// AdminDashboard ->
			response.sendRedirect("InclusionHome.jsp"); // AdminHome
		} else {
			response.sendRedirect("InitLogin.jsp");
		}

	}      

}
