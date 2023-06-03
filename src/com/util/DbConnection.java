package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {

		// java ----> mysql

		String driver = "com.mysql.cj.jdbc.Driver"; // drive the manager to the database -> to establish the connection  
		
		String url = "jdbc:mysql://localhost:3306/adv2023";
		String userName = "root";
		String password = "root";
		// MSACCESS
		// class -> load -> memory

		try {
			Class.forName(driver); // load driver into memory

			Connection con = DriverManager.getConnection(url, userName, password);
			
			System.out.println("dbConnected");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Invalid Driver...");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
