package com.fairyoo.fring.rabbit.topic;

import com.fairyoo.fring.rabbit.TopicRabbitConfig;
import com.fairyoo.fring.util.FringTimeUtil;
import lombok.var;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Date;

/**
 * @author MengYi at 2019-01-07 17:06
 */
@Component
public class TopicRabbitSender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send_routingKey1_String(String message) throws IOException {

        var str = MessageFormat.format("{0}  ({1})", message, FringTimeUtil.yyyyMMddHHmmss(new Date()));

        this.amqpTemplate.convertAndSend(TopicRabbitConfig.topic_exchangeName, TopicRabbitConfig.topic_routingKey1, str);
    }


    public void send_routingKey2_String(String message) throws IOException {

        var str = MessageFormat.format("{0}  ({1})", message, FringTimeUtil.yyyyMMddHHmmss(new Date()));

        this.amqpTemplate.convertAndSend(TopicRabbitConfig.topic_exchangeName, TopicRabbitConfig.topic_routingKey2, str);
    }
}
