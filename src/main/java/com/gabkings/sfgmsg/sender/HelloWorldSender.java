package com.gabkings.sfgmsg.sender;

import com.gabkings.sfgmsg.config.JmsConfig;
import com.gabkings.sfgmsg.model.HelloWorld;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class HelloWorldSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage(){
        System.out.println("I am sending message");
        HelloWorld helloWorld = HelloWorld.builder().id(UUID.randomUUID()).message("Hi there, it nice meeting you").build();
        jmsTemplate.convertAndSend(JmsConfig.msgQue, helloWorld);
        System.out.println("Message sent");
    }


}
