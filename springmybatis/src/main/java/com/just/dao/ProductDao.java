package com.just.dao;

import java.util.List;

import com.just.pojo.Product;

public interface ProductDao {

	public boolean createProduct(Product product) throws Exception ;
    public boolean deleteProduct(int id) throws Exception ;
    public boolean updateProduct(Product product) throws Exception ;
    public List<Product> listProduct() throws Exception ;
    public Product getProduct(int id) throws Exception ;
}
