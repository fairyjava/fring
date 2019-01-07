package com.fairyoo.fring.rabbit.hello;

import com.fairyoo.fring.rabbit.FringRabbitConfig;
import com.fairyoo.fring.util.FringTimeUtil;
import lombok.var;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author MengYi at 2019-01-04 18:12
 */
@Component
public class HelloRabbitSender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(String message) {

        var str = MessageFormat.format("{0}  ({1})", message, FringTimeUtil.yyyyMMddHHmmss(new Date()));

        this.amqpTemplate.convertAndSend(FringRabbitConfig.hello_queueName, str);
    }
}
