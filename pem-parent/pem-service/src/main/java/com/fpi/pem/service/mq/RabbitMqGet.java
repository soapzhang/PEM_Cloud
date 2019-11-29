package com.fpi.pem.service.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = "hello")
public class RabbitMqGet {

    @RabbitHandler
    public void process(String content){

    }

}
