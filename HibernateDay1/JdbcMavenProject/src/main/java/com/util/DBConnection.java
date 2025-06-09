package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driver ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/hr";
		String username="root";
		String password="root";
	
			Class.forName(driver);  // register driver
			Connection con=DriverManager.getConnection(url,username,password);
			return con;
	
	}
}
