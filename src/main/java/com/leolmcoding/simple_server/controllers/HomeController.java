package com.leolmcoding.simple_server.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
    @Value("${APP_NAME}") // desta forma lanca excecao se nao houver a variaviavel de ambiente e nem um "valor padrao"
    private String appName;

//    @Value("#{environment.APP_NAME}")  // desta forma retorna null caso nao seja setado
//    private String appName1;

    @GetMapping("/") 
    public String home() {
        LOGGER.info("REQUISICAO ENVIADA PARA : {}",appName);
        return "static/templates/index.html";
    }
}
