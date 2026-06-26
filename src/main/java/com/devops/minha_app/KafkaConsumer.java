package com.devops.minha_app;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "meu-topico", groupId = "meu-grupo")
    public void receberMensagem(String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }
}