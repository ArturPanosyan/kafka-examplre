package com.example.kafkaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaExampleApplication {
    private Producer producer;

    public KafkaExampleApplication() {
        this.producer = new Producer();
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam(value = "message") String message) {
        producer.sendMessage("test", "key", message);
        return "Message sent to Kafka: " + message;
    }
}
