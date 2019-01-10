//package com.fairyoo.fring.rabbit.hello;
//
//import com.fairyoo.fring.rabbit.FringRabbitConfig;
//import com.fairyoo.fring.util.FringJsonUtil;
//import com.fairyoo.fring.web.dtoout.IOut;
//import lombok.var;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//import java.text.MessageFormat;
//
///**
// * 消费者2
// *
// * @author MengYi at 2019-01-07 15:13
// */
//@Component
//@RabbitListener(queues = FringRabbitConfig.hello_queueName)
//public class HelloRabbitReciver2 {
//
//
//    /**
//     * 消费string类型的消息
//     *
//     * @author by MengYi at 2019-01-07 15:40
//     */
//    @RabbitHandler
//    public void processString(String message) throws Exception {
//
//        var msg = MessageFormat.format("[{0}][@RabbitHandler][队列名称：{1}] [消费string类型的消息]: {2}" , HelloRabbitReciver2.class.getSimpleName(), FringRabbitConfig.hello_queueName, message);
//        System.out.println(msg);
//    }
//
//
//    /**
//     * 消费dto类型的消息
//     *
//     * @author by MengYi at 2019-01-07 15:39
//     */
//    @RabbitHandler
//    public void processDto(IOut out) throws Exception {
//
//        var message = FringJsonUtil.convertObj2String(out) ;
//
//        var msg = MessageFormat.format("[{0}][@RabbitHandler][队列名称：{1}] [消费dto类型的消息]: {2}" , HelloRabbitReciver2.class.getSimpleName(), FringRabbitConfig.hello_queueName, message);
//        System.out.println(msg);
//
//    }
//}