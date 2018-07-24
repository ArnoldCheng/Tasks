package com.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.just.dao.ProductDao;
import com.just.pojo.Product;

public class ProductDaoImpl implements ProductDao {
	private Connection conn ;
	private PreparedStatement pstmt ;
	public ProductDaoImpl(Connection conn) {
		this.conn = conn ;
	}
	
	public boolean createProduct(Product product) throws Exception {
		String sql = "insert into product_(name,price) values(?,?)";
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1,product.getName()) ; 
		this.pstmt.setFloat(2, product.getPrice());
		return this.pstmt.executeUpdate() > 0;
	}

	public boolean deleteProduct(int id) throws Exception {
		String sql = "delete from product_ where id=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1, id);
		return this.pstmt.executeUpdate() > 0;
	}

	public boolean updateProduct(Product product) throws Exception {
		String sql = "update product_ set name=?,price=? where id=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setString(1, product.getName());
		this.pstmt.setFloat(2, product.getPrice());
		this.pstmt.setInt(3, product.getId());
		return this.pstmt.executeUpdate() > 0;
	}

	public List<Product> listProduct() throws Exception {
		List<Product> products = new ArrayList<Product>() ;
		String sql = "select id,name,price from product_" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		ResultSet rs = this.pstmt.executeQuery();
		while(rs.next()) {
			Product product = new Product() ;
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2)) ;
			product.setPrice(rs.getFloat(3));
			products.add(product) ;
		}
		return products;
	}

	public Product getProduct(int id) throws Exception {
		Product product = null ;
		String sql = "select id,name,price from product_ where id=?" ;
		this.pstmt = this.conn.prepareStatement(sql) ;
		this.pstmt.setInt(1, id);
		ResultSet rs = this.pstmt.executeQuery() ;
		if (rs.next()) {
			product = new Product() ;
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2)) ;
			product.setPrice(rs.getFloat(3));
		}
		return product;
	}

}
