package com.example.demo.controller;

import com.example.demo.servlets.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.io.IOException;

@Controller
public class Login2 {

    @PostMapping(path="/Login")
    public String afterloginpage(Model model, HttpServletRequest request, HttpServletResponse response){
        Login login=new Login();
        try {
           return login.Response(request,response);
       } catch (ServletException e) {throw new RuntimeException(e);} catch (IOException e) {throw new RuntimeException(e);}
   }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping(path ={"/welcome"})
    public String mainpage(Model model){
        String body="welcome";
        model.addAttribute("welcome", body);
        return "welcome";
    }

    @GetMapping(path="/Register")
    public String registrationpage(Model model){
        return "register";
    }

    @PostMapping(path="/RegistrationForm")
    public String afterregistrationpage(Model model, jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response){
        Register reg=new Register();
        try {
            return reg.Registration(request,response);
        } catch (ServletException e) {throw new RuntimeException(e);} catch (IOException e) {throw new RuntimeException(e);}
    }


}