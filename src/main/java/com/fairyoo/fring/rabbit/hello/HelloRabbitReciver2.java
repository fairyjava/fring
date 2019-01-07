package com.fairyoo.fring.rabbit.hello;

import com.fairyoo.fring.rabbit.FringRabbitConfig;
import com.fairyoo.fring.util.FringJsonUtil;
import com.fairyoo.fring.web.dtoout.IOut;
import lombok.var;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者2
 *
 * @author MengYi at 2019-01-07 15:13
 */
@Component
@RabbitListener(queues = FringRabbitConfig.hello_queueName)
public class HelloRabbitReciver2 {


    /**
     * 消费string类型的消息
     *
     * @author by MengYi at 2019-01-07 15:40
    */
    @RabbitHandler
    public void processString(String message) {

        System.out.printf("[%s][@RabbitHandler][队列名称：%s] [消费string类型的消息]: %s" , HelloRabbitReciver2.class.getSimpleName(), FringRabbitConfig.hello_queueName, message);

    }


    /**
     * 消费dto类型的消息
     *
     * @author by MengYi at 2019-01-07 15:39
     */
    @RabbitHandler
    public void processDto(IOut out) {
        var message = FringJsonUtil.convertObj2String(out) ;
        System.out.printf("[%s][@RabbitHandler][队列名称：%s] [消费dto类型的消息]: %s" , HelloRabbitReciver2.class.getSimpleName(), FringRabbitConfig.hello_queueName, message);
    }
}