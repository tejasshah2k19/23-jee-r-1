package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;
		String errorMsg = "";

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName"); 
		}else {
			request.setAttribute("firstNameValue", firstName);
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email"); 
		}else {
			request.setAttribute("emailValue", email);
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			 request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError == true) {
			// go back
			// Registration.jsp 
			
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response); // Registration.jsp
		} else {
			// go ahead
			// Login.jsp
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}

	}
}
