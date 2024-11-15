package com.leolmcoding.simple_server.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${APP_NAME}") // desta forma lanca excecao se nao houver a variaviavel de ambiente e nem um "valor padrao"
    private String appName;

//    @Value("#{environment.APP_NAME}")  // desta forma retorna null caso nao seja setado
//    private String appName1;

    @GetMapping("/") 
    public String home() {
        System.out.println(appName);
        return "static/templates/index.html";
    }
}
