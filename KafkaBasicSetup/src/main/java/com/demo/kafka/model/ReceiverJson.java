package com.demo.kafka.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class ReceiverJson {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(ReceiverJson.class);


  @KafkaListener(topics = "helloworld.t")
  public void receive(UserObject payload) {
    LOGGER.info("received payload='{}'", payload.toString());
  }
}
