package com.bhavesh.Utils;

import java.sql.*;

public class DBUtil {

	 private static final String URL = "jdbc:mysql://localhost:3306/test";
	 private static final String USERNAME = "root";
	 private static final String PASSWORD = "root123";
    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
