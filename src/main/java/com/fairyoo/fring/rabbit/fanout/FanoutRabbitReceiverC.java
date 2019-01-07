package com.fairyoo.fring.rabbit.fanout;

import com.fairyoo.fring.rabbit.FanoutRabbitConfig;
import lombok.var;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

/**
 * @author MengYi at 2019-01-07 23:33
 */

@Component
@RabbitListener(queues = FanoutRabbitConfig.fanout_queueName_fanoutC)
public class FanoutRabbitReceiverC {

    @RabbitHandler
    public void processString(String message) {

        var msg = MessageFormat.format("[{0}][@RabbitHandler][队列名称：{1}] [消费string类型的消息]: {2}" , FanoutRabbitReceiverC.class.getSimpleName(), FanoutRabbitConfig.fanout_queueName_fanoutC, message);
        System.out.println(msg);

    }
}
