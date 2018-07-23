package com.just.mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;


public class InsertTest {

	public static void main(String[] args) {
		/*Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "zard");
		String sql = "insert into product_(name,price) values(?,?)";
		conn.setAutoCommit(false);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		long start = System.currentTimeMillis() ;
		for (int i = 1; i < 1000000; i++) {
			pstmt.setString(1,"Product" + UUID.randomUUID());
            pstmt.setFloat(2,(float)Math.random() *1000);
            pstmt.addBatch();
			// 1w条记录插入一次
			if (i % 100000 == 0) {
				pstmt.executeBatch();
				conn.commit();
			}
		}
		// 最后插入不足1w条的数据
		pstmt.executeBatch();
		conn.commit();
		 long end = System.currentTimeMillis() ;
         System.out.println("花费时间" + (end-start) + "毫秒");*/
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
		// 测试插入数据库的功能：
		for (int n = 0; n < 300; n++) {
			StringBuffer sBuffer = new StringBuffer(" insert into product_(name,price) values ");
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		long end = System.currentTimeMillis();
		System.out.println("run time:" + (end - start));
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
