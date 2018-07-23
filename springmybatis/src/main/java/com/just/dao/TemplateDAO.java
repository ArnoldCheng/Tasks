package com.just.dao;

import java.util.List;

import com.just.pojo.Product;

public interface TemplateDAO {
	
	public int createProduct(Product product) ;
    public void deleteProduct(int id) ;
    public int updateProduct(Product product) ;
    public List<Product> listProduct() ;
    public Product getProduct(int id) ;
}
