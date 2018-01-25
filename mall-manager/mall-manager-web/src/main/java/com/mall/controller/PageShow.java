package com.mall.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageShow {


    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
