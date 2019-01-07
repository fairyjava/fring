package com.fairyoo.fring.rabbit.hello;

import com.fairyoo.fring.rabbit.FringRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author MengYi at 2019-01-07 15:13
 */
@Component
@RabbitListener(queues = FringRabbitConfig.hello_queueName)
public class HelloRabbitReciver2 {


    @RabbitHandler
    public void process(String message) {

        System.out.printf("[%s][@RabbitHandler][队列名称：%s] : %s" , HelloRabbitReciver2.class.getSimpleName(), FringRabbitConfig.hello_queueName, message);

    }
}