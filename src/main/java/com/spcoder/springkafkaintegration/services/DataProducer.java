package com.spcoder.springkafkaintegration.services;


import com.spcoder.springkafkaintegration.common.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class DataProducer
{
    private static final Logger LOGGER = LoggerFactory.getLogger(DataProducer.class);

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public void sendMessage(String message) {
        LOGGER.info(String.format("Sending Message - '%s' to topic - %s ", message, Constants.TEST_TOPIC));
        this.kafkaTemplate.send(Constants.TEST_TOPIC, message);
    }

}
