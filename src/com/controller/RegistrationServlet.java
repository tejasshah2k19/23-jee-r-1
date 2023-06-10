package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
import com.util.DbConnection;
import com.util.Validators;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName"); // t20 8
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;

		if (Validators.isEmpty(firstName) == true) {
			isError = true;
			request.setAttribute("firstNameError", "<font color='red'>Please Enter FirstName</font>");
		} else {
			// t20
			if (Validators.isAlpha(firstName) == false) {
				request.setAttribute("firstNameError", "Please Enter Valid FirstName");
			}
			request.setAttribute("firstNameValue", firstName);

		}
		if (Validators.isEmpty(email) == true) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		} else {
			if (Validators.isEmail(email) == false) {
				request.setAttribute("emailError", "Please Enter Valid Email");
			}
			request.setAttribute("emailValue", email);
		}
		if (Validators.isEmpty(password) == true) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError == true) {
	 
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response); // Registration.jsp
		} else {
		 
			UserDao userDao = new UserDao();
			userDao.addUser(firstName, email, password);
			
 
			RequestDispatcher rd = request.getRequestDispatcher("ListUserServlet");
			rd.forward(request, response);
		}

	}
}
