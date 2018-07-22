package com.just.mapper;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.just.pojo.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductMapperTest {

	@Autowired
    private ProductMapper mapper;

    @Test
    public void createProductTest() {
        Product product = new Product();
        product.setName("product" + UUID.randomUUID());
        product.setPrice((float)Math.random() * 1000);
        int num = mapper.createProduct(product);
        System.out.println(product.getId());
        System.out.println("返回插入的行数：" + num);
    }

    @Test
    public void listProductTest() {
        List<Product> list = mapper.listProduct() ;
        for( Product product :list) {
            System.out.println(product);
        }
    }
    @Test
    public void deleteProductTest() {
        System.out.println(mapper.deleteProduct(2));
    }
    @Test
    public void updateProductTest() {
        Product product = mapper.getProduct(3);
        //product.setName("zero");
        product.setPrice(51);
        mapper.updateProduct(product);
        System.out.println(mapper.getProduct(3));
    }
}
