package com.demo.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kafka.model.SenderJson;
import com.demo.kafka.model.UserObject;

@RestController
@RequestMapping(value = "/kafkajson")
public class KafkaControllerJson {

    private final SenderJson sender;

    @Autowired
    KafkaControllerJson(SenderJson sender) {
        this.sender = sender;
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/publish")
//    public void sendMessageToKafkaTopic(@RequestBody UserObject object) {
//    	System.out.println(object.toString());
//        this.sender.send(object);
//    }
    @RequestMapping(method = RequestMethod.POST, value = "/publish/")
    public void sendMessageToKafkaTopic(@RequestBody UserObject object) {
    	System.out.println(object.toString());
        this.sender.send(object);
    }
}
