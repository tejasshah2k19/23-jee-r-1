package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DbConnection;

public class UserDao {

	public void addUser(String firstName, String email, String password) {
		try {

			Connection con = DbConnection.getConnection();
			System.out.println("dbConnected");
			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password ) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			pstmt.executeUpdate(); // update => change the state of database -->

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public ResultSet getAllUsers() {
		try {
			Connection con = DbConnection.getConnection();
			// prepared statement
			PreparedStatement pstmt = con.prepareStatement("select * from users");

			// executeUpdate() --> insert update delete
			// executeQuery() -->select -->read only

			ResultSet data = pstmt.executeQuery();
			return data;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
