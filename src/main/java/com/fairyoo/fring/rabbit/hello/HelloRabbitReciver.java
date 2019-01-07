package com.fairyoo.fring.rabbit.hello;

import com.fairyoo.fring.rabbit.FringRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author MengYi at 2019-01-07 14:33
 */

@Component
@RabbitListener(queues = FringRabbitConfig.hello_queueName)
public class HelloRabbitReciver {


    @RabbitHandler
    public void process(String message) {

        System.out.printf("[@RabbitHandler][队列名称：%s] : %s" ,FringRabbitConfig.hello_queueName, message);

    }
}
