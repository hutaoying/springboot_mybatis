package com.example.lombokdemo.controller;

import com.example.lombokdemo.pojo.Category;
import com.example.lombokdemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/category/{id}")
    public Category getCategory(@PathVariable("id") Integer id){
        return categoryService.get(id);
    }
}
