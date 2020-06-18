package com.flipkart.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//database connection utility
public class DBUtil {
	private static final Logger logger = LoggerFactory.getLogger(DBUtil.class);
	private static Connection connection = null;
	//get connection from database
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection and return Connection class object 
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkartdb", "root", "root");
		} catch (ClassNotFoundException e) {
			logger.error(e.getMessage());
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		return connection;

	}
}
