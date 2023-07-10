package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.util.Validators;

public class SignupRegExFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String firstName = request.getParameter("firstName");
		// email
		// password

		boolean isError = false;
		if (Validators.isAlpha(firstName) == false) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter Valid FirstName [a-zA-Z] ");
		}

		if (isError == true) {
			// goBack
			RequestDispatcher rd = request.getRequestDispatcher("FilterSignup.jsp");
			rd.forward(request, response);
		} else {
			// rd
			chain.doFilter(request, response);// goahead --> servlet | filter
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}
}
