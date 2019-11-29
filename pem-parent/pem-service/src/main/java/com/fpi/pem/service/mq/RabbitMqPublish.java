package com.fpi.pem.service.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqPublish {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void publish(String queueName,Object content ){
        this.rabbitTemplate.convertAndSend(queueName,content);
    }
}
