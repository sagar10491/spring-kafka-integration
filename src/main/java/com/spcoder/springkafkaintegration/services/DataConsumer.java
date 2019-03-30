package com.spcoder.springkafkaintegration.services;

import java.io.IOException;

import com.spcoder.springkafkaintegration.common.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class DataConsumer
{

    private final static Logger LOGGER  = LoggerFactory.getLogger(DataConsumer.class);

    @KafkaListener( topics = Constants.TEST_TOPIC)
    public void consume(String message) throws IOException
    {
        LOGGER.info(String.format("#### -> Consumed message -> %s", message));
    }
}
