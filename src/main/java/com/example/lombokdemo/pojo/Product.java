package com.example.lombokdemo.pojo;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;

    private String name;

    private Float pPrice;

    private Integer cId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getpPrice() {
        return pPrice;
    }

    public void setpPrice(Float pPrice) {
        this.pPrice = pPrice;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}