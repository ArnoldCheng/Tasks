package com.just;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	private static final String DRIVER = "com.mysql.jdbc.Driver" ;
	private static final String URL = "jdbc:mysql://localhost:3306/demo" ;
	private static final String USERNAME = "root" ;
	private static final String PASSWORD = "zard" ;
	private Connection conn ;
	
	public Connection getConnection() {
		return conn ;
	}	
	public JdbcConnection() {
		try {
			Class.forName(DRIVER);
			this.conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public void Close() {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
