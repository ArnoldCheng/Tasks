package com.just;

import java.sql.SQLException;
import java.util.UUID;


public class InsertTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
 
		java.sql.Connection conn = null ;
		java.sql.Statement stmt = null ;
		try {
			conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "zard");
			 stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
 
		int total = 100000;
		System.out.println("====start=====");
		
		long start = System.currentTimeMillis();
		// 测试插入数据库的功能
		for (int n = 0; n < 300; n++) {
			StringBuffer sBuffer = new StringBuffer(" insert into product1(name,price) values ");
			for (int i = 0; i < total; i++) {
				String userName = UUID.randomUUID().toString();
				Float price = (float)Math.random() *1000 ;
				if (i == total - 1) {
					sBuffer.append("('" + userName  + "'" + "," + price +");");
				} else {
					sBuffer.append("('" + userName  + "'" + "," + price +"),");
				}
			}
			System.out.println("第" + n + "次插入10万条数据！");
			try {
				stmt.executeUpdate(sBuffer.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		long end = System.currentTimeMillis();
		System.out.println("run time:" + (end - start));
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
