package com.devops.minha_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final KafkaProducer kafkaProducer;

    public HelloController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo DevOps! 🚀";
    }

    @GetMapping("/devops")
    public String devops() {
        return "Bem vindo ao mundo DevOps! 🚀";
    }

    @GetMapping("/kafka/enviar")
    public String enviarMensagem(@RequestParam String mensagem) {
        kafkaProducer.enviarMensagem(mensagem);
        return "Mensagem enviada para o Kafka: " + mensagem;
    }
}