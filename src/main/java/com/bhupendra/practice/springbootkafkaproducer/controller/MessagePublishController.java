package com.bhupendra.practice.springbootkafkaproducer.controller;

import com.bhupendra.practice.springbootkafkaproducer.model.Customer;
import com.bhupendra.practice.springbootkafkaproducer.service.Producer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessagePublishController {

    private static final String TOPIC = "customer";


    @Autowired
    private Producer producer;


    @PostMapping("/customers")
    public String postCustomerToKafka(@RequestBody final Customer customer) throws JsonProcessingException {
        String customerString = new ObjectMapper().writeValueAsString(customer);
        producer.sendCustomerMessage(customerString);
        return "Published Message";

    }
}
