package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

@WebServlet("/ListUserServlet")
public class ListUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// db users-> read -> 4 record
		try {

			UserDao userDao = new UserDao();
			ArrayList<UserBean> users = userDao.getAllUsers();
			//row { userId email firstName } 
			
			//[ {}  {}  {}  {}  {}  ]
			
			//ArrayList
			
			
			
			request.setAttribute("users", users);
			
			RequestDispatcher rd = request.getRequestDispatcher("ListUser.jsp");
			rd.forward(request, response);

		} catch (Exception e) {

		}

		// set ->
		// jsp ->

	}
}
