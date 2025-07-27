package com.example.producer.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @JmsListener(destination = "testQueue")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}
