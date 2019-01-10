package com.demo.kafka.controller;

import org.apache.kafka.clients.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kafka.model.Sender;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Sender sender;

    @Autowired
    KafkaController(Sender sender) {
        this.sender = sender;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.sender.send(message);
    }
}
