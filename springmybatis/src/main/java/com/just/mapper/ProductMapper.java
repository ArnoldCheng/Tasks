package com.just.mapper;

import com.just.pojo.Product;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProductMapper {
	//@Insert("insert into product_ (name,price) values(#{name},#{price})")
    public int createProduct(Product product) ;
	
	//@Delete("delete from product_ where id=#{id}")
    public boolean deleteProduct(int id) ;
	
	//@Update(" update product_ set  name = #{name},price =#{price}  where id = #{id}")
    public void updateProduct(Product product) ;
	
	//@Select("select * from product_ ")
    public List<Product> listProduct() ;
	
	//@Select("select * from product_ where id = #{id}")
    public Product getProduct(int id) ;
}
