package com.gabkings.sfgmsg.listener;

import com.gabkings.sfgmsg.config.JmsConfig;
import com.gabkings.sfgmsg.model.HelloWorld;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

/**
 * Created by jt on 2019-07-17.
 */
@Component
class HelloMessageListener {

    @JmsListener(destination = JmsConfig.msgQue)
    public void listen(@Payload HelloWorld helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){

        System.out.println("I Got a Message!!!!!");

        System.out.println(helloWorldMessage);


        // uncomment and view to see retry count in debugger
        // throw new RuntimeException("foo");

    }

}
