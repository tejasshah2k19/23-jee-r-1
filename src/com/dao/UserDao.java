package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.RegistrationBean;
import com.util.DbConnection;

public class UserDao {

	public void addUser(RegistrationBean registrationBean) {
		try {
			// FirstName
			Connection con = DbConnection.getConnection();
			System.out.println("dbConnected");
			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password ) values (?,?,?)");
			pstmt.setString(1, registrationBean.getFirstName());
			pstmt.setString(2, registrationBean.getEmail());
			pstmt.setString(3, registrationBean.getPassword());

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
