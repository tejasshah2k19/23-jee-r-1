package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.RegistrationBean;
import com.bean.UserBean;
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

	public ArrayList<UserBean> getAllUsers() {
		try {
			Connection con = DbConnection.getConnection();
			// prepared statement
			PreparedStatement pstmt = con.prepareStatement("select * from users");

			// executeUpdate() --> insert update delete
			// executeQuery() -->select -->read only

			ResultSet data = pstmt.executeQuery();
			
			

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
			return users;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public void deleteUserById(int userId) {
		try {

				Connection con  = DbConnection.getConnection(); 
				PreparedStatement pstmt = con.prepareStatement("delete from users where userId = ? ");
				pstmt.setInt(1, userId);
				pstmt.executeUpdate(); 
				
				
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}











