package com.fairyoo.fring.rabbit.fanout;

import com.fairyoo.fring.rabbit.FanoutRabbitConfig;
import com.fairyoo.fring.util.FringTimeUtil;
import lombok.var;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Date;

/**
 * @author MengYi at 2019-01-07 23:30
 */
@Component
public class FanoutRabbitSender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void sendString(String message) throws IOException {

        var str = MessageFormat.format("{0}  ({1})", message, FringTimeUtil.yyyyMMddHHmmss(new Date()));

        this.amqpTemplate.convertAndSend(FanoutRabbitConfig.fanout_exchange_name, "", str);
    }
}
