//package com.fairyoo.fring.rabbit.topic;
//
//import com.fairyoo.fring.rabbit.TopicRabbitConfig;
//import lombok.var;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//import java.text.MessageFormat;
//
///**
// * @author MengYi at 2019-01-07 17:18
// */
//@Component
//@RabbitListener(queues = TopicRabbitConfig.topic_queueName1)
//public class TopicRabbitReciver {
//
//    /**
//     * 消费string类型的消息
//     *
//     * @author by MengYi at 2019-01-07 17:21
//    */
//    @RabbitHandler
//    public void processString(String message) {
//
//        var msg = MessageFormat.format("[{0}][@RabbitHandler][队列名称：{1}] [消费string类型的消息]: {2}" , TopicRabbitReciver.class.getSimpleName(), TopicRabbitConfig.topic_queueName1, message);
//        System.out.println(msg);
//    }
//}
