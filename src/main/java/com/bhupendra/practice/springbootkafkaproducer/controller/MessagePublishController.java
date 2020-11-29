package com.bhupendra.practice.springbootkafkaproducer.controller;

import com.bhupendra.practice.springbootkafkaproducer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessagePublishController {

    private static final String TOPIC = "customer";


    @Autowired
    private KafkaTemplate<String, Customer> kafkaTemplate;


    @PostMapping("/customers")
    public String postCustomerToKafka(@RequestBody final Customer customer) {
        kafkaTemplate.send(TOPIC, customer);
        return "Published Message";

    }
}
