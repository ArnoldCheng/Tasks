package com.just.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.just.JdbcTemplateUtil;
import com.just.dao.TemplateDAO;
import com.just.pojo.Product;

public class TemplateDAOImpl implements TemplateDAO  {

	public int createProduct(Product product) {
		String sql = "insert into product_(name,price) values(?,?)";
        int count = JdbcTemplateUtil.jdbcTemplate().update(sql, product.getName(),
                product.getPrice());
        return count;
	}

	public List<Product> listProduct() {
		String sql = "select * from product_" ;
		RowMapper<Product> rowMapper = new BeanPropertyRowMapper<Product>(Product.class) ;
		List<Product> products = JdbcTemplateUtil.jdbcTemplate().query(sql,rowMapper) ;
		return products;
	}

	public void deleteProduct(int id) {
		String sql = "delete from product_ where id=? " ;
		JdbcTemplateUtil.jdbcTemplate().update(sql,id) ;
	}

	public int updateProduct(Product product) {
		String sql = "update product_ set name=?,price=? where id=?" ;
		int count =JdbcTemplateUtil.jdbcTemplate().update(sql,product.getName(),product.getPrice(),product.getId()) ;
		return count;
	}

	public Product getProduct(int id) {
		String sql = "select * from product_ where id=?" ;
		RowMapper<Product> rowMapper = new BeanPropertyRowMapper<Product>(Product.class) ;
		List<Product> products = JdbcTemplateUtil.jdbcTemplate().query(sql,rowMapper,id) ;
		if (products != null && products.size() > 0) {
			return products.get(0) ;
		}
		return null ;
	}

}
