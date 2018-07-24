package com.just.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.just.JdbcConnection;
import com.just.dao.impl.ProductDaoImpl;
import com.just.dao.impl.TemplateDAOImpl;
import com.just.pojo.Product;

public class ProductDaoImplTest {
	
	
	@Test
	public void createProductTest() {
		Product product = new Product();
		product.setName("produc");
		product.setPrice(5.1f);
		try {
			boolean flag = new ProductDaoImpl(new JdbcConnection().getConnection()).createProduct(product) ;
			Assert.assertTrue(flag) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void updateProductTest() {
		Product product;
		try {
			product = new ProductDaoImpl(new JdbcConnection().getConnection()).getProduct(5);
			product.setName("无名氏");
			System.out.println(product);
			boolean flag = new ProductDaoImpl(new JdbcConnection().getConnection()).updateProduct(product);
			Assert.assertTrue(flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void deleteProductTest() {
		try {
			boolean flag = new ProductDaoImpl(new JdbcConnection().getConnection()).deleteProduct(5);
			Assert.assertTrue(flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void listProductTest() {
		List<Product> list;
		try {
			list = new ProductDaoImpl(new JdbcConnection().getConnection()).listProduct();
			Assert.assertEquals(1, list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getProductTest() {
		Product product;
		try {
			product = new ProductDaoImpl(new JdbcConnection().getConnection()).getProduct(5);
			System.out.println(product);
			Assert.assertNotNull(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
