package com.jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	Connection con=null;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://"
					+ "localhost:3306/chennaidb", "root", "root");
		}
		catch(ClassNotFoundException cls) {
			cls.printStackTrace();
		}
		catch(SQLException sql) {
			sql.printStackTrace();
		}
		
		return con;
	}
	
}
