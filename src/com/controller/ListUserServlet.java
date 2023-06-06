package com.controller;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DbConnection;

@WebServlet("/ListUserServlet")
public class ListUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// db users-> read -> 4 record
		try {
			// connection
			Connection con = DbConnection.getConnection();
			// prepared statement
			PreparedStatement pstmt = con.prepareStatement("select * from users");

			// executeUpdate() --> insert update delete
			// executeQuery() -->select -->read only

			ResultSet data = pstmt.executeQuery();

			// non primitive -> array class enum object
			// primitive -> byte short char int long float double boolean

			// data -> record -> extract -> browser print

			response.setContentType("text/html"); // text/html -> MIME
			PrintWriter out = response.getWriter();

			out.print("<html><body>");

			while (data.next()) { // 1 record 2nd false
				String firstName = data.getString("firstName");
				int userId = data.getInt("userId");
				out.print(userId + " " + firstName + "<br><br>");
			}

			out.print("</body></html>");

		} catch (Exception e) {

		}

		// set ->
		// jsp ->

	}
}
