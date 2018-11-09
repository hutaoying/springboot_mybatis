package com.example.lombokdemo.service;

import com.example.lombokdemo.mapper.ProductMapper;
import com.example.lombokdemo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service
public class ProductService {

    @Autowired
    ProductMapper productMapper;

    public void add(Product product) {
        productMapper.insert(product);
    }

   public Product getProduct(Integer id) {
       return productMapper.selectByPrimaryKey(id);
    }
   /* public void add(String name,Float price,Integer cid){

    }*/



}
