package com.just.mapper;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.just.pojo.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductMapperTest {

	@Autowired
    private ProductMapper mapper;

	Logger logger = LoggerFactory.getLogger(ProductMapperTest.class) ;
	
    @Test
    public void createProductTest() {
    	logger.info("进入增加产品的测试方法");
        Product product = new Product();
        product.setName("product" + UUID.randomUUID());
        product.setPrice((float)Math.random() * 1000);
        int num = mapper.createProduct(product);
        System.out.println(product.getId());
        System.out.println("返回插入的行数：" + num);
        logger.debug("结束方法！！！！！！！！！！！！！！");
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
        System.out.println(mapper.deleteProduct(4));
    }
    @Test
    public void updateProductTest() {
        Product product = mapper.getProduct(1);
        //product.setName("zero");
        product.setPrice(51);
        mapper.updateProduct(product);
        System.out.println(mapper.getProduct(1));
    }
}
