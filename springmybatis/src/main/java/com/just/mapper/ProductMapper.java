package com.just.mapper;

import com.just.pojo.Product;

import java.util.List;

public interface ProductMapper {
    public int createProduct(Product product) ;
    public boolean deleteProduct(int id) ;
    public void updateProduct(Product product) ;
    public List<Product> listProduct() ;
    public Product getProduct(int id) ;
}
