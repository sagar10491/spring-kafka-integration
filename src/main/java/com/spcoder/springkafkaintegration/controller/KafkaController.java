package com.spcoder.springkafkaintegration.controller;

import com.spcoder.springkafkaintegration.services.DataProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/kafka/message/")
public class KafkaController
{
    @Autowired
    private DataProducer dataProducer;

    @PostMapping(value = "/send")
    public void sendMessageToKafkaTopic(@RequestBody String message) {
        this.dataProducer.sendMessage(message);
    }
}
