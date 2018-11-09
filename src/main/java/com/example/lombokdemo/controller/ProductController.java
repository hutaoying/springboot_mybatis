package com.example.lombokdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.lombokdemo.Utils.SelfResult;
import com.example.lombokdemo.pojo.Product;
import com.example.lombokdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    Product product;
    @PostMapping("/product")
    public SelfResult addCategory(@RequestBody JSONObject jsonObject){

        return  SelfResult.build(0,"success");
    }
   /* @PostMapping("/product1")
    public SelfResult addCategorytest(@RequestBody JSONObject jsonObject){
        product=new Product();
        String name=jsonObject.getString("name");
        Float price=jsonObject.getFloat("price");
        Integer cid=jsonObject.getInteger("cid");
       if(product==null){
            System.out.println("aa");
        }
        productService.addT(name,price,cid);
        return  SelfResult.build(0,"success");
    }*/
    @GetMapping("/product/{id}")
    public SelfResult getProduct(@PathVariable Integer id){
        product=new Product();
        product=productService.getProduct(id);
        return  SelfResult.build(0,"success",product);
    }
}
