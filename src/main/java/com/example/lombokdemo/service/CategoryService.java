package com.example.lombokdemo.service;


import com.example.lombokdemo.pojo.Category;
import org.springframework.cache.annotation.Cacheable;


public interface CategoryService {

    void add(Category category);

    void delete(int id);

    void update(Category category);

    Category get(int id);

}
