package com.javase.cxf.rest.impl;

import com.javase.cxf.dao.ProductDao;
import com.javase.cxf.entity.Product;
import com.javase.cxf.rest.ProductService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.FormParam;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 11/27/16.
 */
public class ProductServiceImpl implements ProductService {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis-config.xml";
        InputStream is = ProductServiceImpl.class.getClassLoader().getResourceAsStream(resource);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // sqlSessionFactory.getConfiguration().addMapper(UserDao.class);
    }

    public List<Product> retrieveAllProducts() {
        return null;
    }

    public Product retrieveProductById(long id) {
        return null;
    }

    public List<Product> retrieveProductByName(@FormParam("name") String name) {
        return null;
    }

    public Product createProduct(Product product) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Product newProduct = new Product();
        newProduct.setPrice(23.234);
        newProduct.setName("hello");
        try {
            ProductDao ProductDao = sqlSession.getMapper(ProductDao.class);

            ProductDao.createProduct(newProduct);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return newProduct;
    }

    public Product updateProductById(long id, Map<String, Object> fieldMap) {
        return null;
    }

    public Product deleteProdcutById(long id) {
        return null;
    }
}
