package com.devops.minha_app;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarMensagem(String mensagem) {
        kafkaTemplate.send("meu-topico", mensagem);
        System.out.println("Mensagem enviada: " + mensagem);
    }
}