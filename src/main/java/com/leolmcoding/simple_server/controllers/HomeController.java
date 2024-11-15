package com.leolmcoding.simple_server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") 
    public String home() {
        return "static/templates/index.html";
    }
}
