package com.example.demo.controller;

import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entity.ProductsEntity;
import com.example.demo.services.IProductService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




@Controller
public class HTTPController {

    @Autowired
    ProductService productService;
    @Autowired
    private IProductService emp;

    @GetMapping({"/list1", "/welcomeadmin"})
    private ModelAndView getAllBooks() {
        ModelAndView model = new ModelAndView("welcomeadmin");
        model.addObject("allProducts", emp.findAll());
        return model;
    }
}