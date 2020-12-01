package com.bhupendra.practice.springbootkafkaproducer.service;

import com.bhupendra.practice.springbootkafkaproducer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC = "customer";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendCustomerMessage(String customer) {
        kafkaTemplate.send(TOPIC, customer);
    }
}
