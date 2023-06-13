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
			ResultSet data = userDao.getAllUsers();
			//row { userId email firstName } 
			
			//[ {}  {}  {}  {}  {}  ]
			
			//ArrayList
			
			
			ArrayList<UserBean> users = new ArrayList<UserBean>(); 
			
			while(data.next()) {
				Integer userId = data.getInt("userId");
				String fn = data.getString("firstName");
				String email = data.getString("email");
				
				UserBean user = new UserBean();
				user.setUserId(userId);
				user.setFirstName(fn);
				user.setEmail(email);
				
				users.add(user);
				
				
			}
			
			request.setAttribute("users", users);
			
			RequestDispatcher rd = request.getRequestDispatcher("ListUser.jsp");
			rd.forward(request, response);

		} catch (Exception e) {

		}

		// set ->
		// jsp ->

	}
}
