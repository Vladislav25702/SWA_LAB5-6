package com.example.demo.controller;

import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HTTPController2 {

    @Autowired
    SectionsService productService;
    @Autowired
    private ISectionService emp;

    @GetMapping({"/list", "/welcomeuser"})
    private ModelAndView getAllBooks() {
        ModelAndView model = new ModelAndView("welcomeuser");
        model.addObject("allSections", emp.findAll());
        return model;
    }
}