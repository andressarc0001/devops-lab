package com.devops.minha_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo DevOps! 🚀";
    }

    @GetMapping("/devops")
    public String devops() {
        return "Bem vindo ao mundo DevOps! 🚀";
    }
}