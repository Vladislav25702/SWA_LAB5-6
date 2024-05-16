package com.example.demo.services;
import com.example.demo.entity.ProductsEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.demo.entity.SectionsEntity;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    IProductService iProductService;

    public List<ProductsEntity> loadAllBooks() {
        return (List<ProductsEntity>) iProductService.findAll();
    }
}