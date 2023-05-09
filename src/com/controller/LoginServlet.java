package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//throw vs throws vs Throwable{class -> Parent of all Exception class - including Exception } 
//Throwable -> Exception | Error 

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		response.setContentType("text/html"); // MIME Type
		PrintWriter out = response.getWriter();// IO -> connection fail -> runtime error -> exception
		out.println("<html><body>");

		boolean isError = false;
		String error = "";

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter Email<br>";
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter Password<br>";
		}

		if (isError == true) {
			out.print("<font color='red'>"+error+"</font>");
		} else {
			out.print("Email : " + email);
			out.print("<br>");
			out.print("Password : " + password);

		}

		out.print("</body></html>");

	}
}
