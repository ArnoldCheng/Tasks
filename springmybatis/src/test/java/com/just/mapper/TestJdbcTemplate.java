package com.just.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.just.dao.impl.TemplateDAOImpl;
import com.just.pojo.Product;

public class TestJdbcTemplate {

	@Test
	public void createProductTest() {
		Product product = new Product();
		product.setName("produc");
		product.setPrice(5.1f);
		int num = new TemplateDAOImpl().createProduct(product);
		Assert.assertEquals(1, num);
	}

	@Test
	public void updateProductTest() {
		Product product = new TemplateDAOImpl().getProduct(1);
		product.setName("无名氏");
		System.out.println(product);
		int num = new TemplateDAOImpl().updateProduct(product);
		Assert.assertEquals(1, num);
	}

	@Test
	public void deleteProductTest() {
		new TemplateDAOImpl().deleteProduct(3);
	}

	@Test
	public void listProductTest() {
		List<Product> list = new TemplateDAOImpl().listProduct();
		Assert.assertEquals(7, list.size());
	}

	@Test
	public void getProductTest() {
		Product product = new TemplateDAOImpl().getProduct(4);
		Assert.assertNotNull(product);
	}
}