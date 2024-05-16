package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/")
public class Control {

    @GetMapping(path ={"/index","/"})
    public String mainpage(Model model){
        String body="index";
        model.addAttribute("index", body);
        return "index";
    }


}