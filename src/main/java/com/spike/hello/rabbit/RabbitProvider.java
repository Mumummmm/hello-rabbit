package com.spike.hello.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RabbitProvider {

    private AmqpTemplate amqpTemplate;

    public RabbitProvider(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void send() {
        String content = "hello rabbit" + new Date();
        amqpTemplate.convertAndSend("helloRabbit", content);
    }
}
