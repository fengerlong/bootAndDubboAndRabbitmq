package com.dubbo.test.dubboservice.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class send {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping("/send")
    public void send() {
        String sendMsg = "hello " + new Date();
        System.out.println("Sender1 : " + sendMsg);
        amqpTemplate.convertAndSend("hello", sendMsg);
    }
}
