package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conp {
	static Connection connection;

	public static Connection createC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String user = "root";
			String url = "jdbc:mysql://localhost:3306/studentManagementSystem";// change to your database and table name.
			String password = "root";// change to your password

			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}
