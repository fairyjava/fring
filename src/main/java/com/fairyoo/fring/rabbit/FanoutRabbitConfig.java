//package com.fairyoo.fring.rabbit;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.FanoutExchange;
//import org.springframework.amqp.core.Queue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author MengYi at 2019-01-07 23:23
// */
//@Configuration
//public class FanoutRabbitConfig {
//
//    public final static String fanout_queueName_fanoutA = "fring.queueName.fanout.A";
//    public final static String fanout_queueName_fanoutB = "fring.queueName.fanout.B";
//    public final static String fanout_queueName_fanoutC = "fring.queueName.fanout.C";
//
//    public final static String fanout_exchange_name = "fring.exchange.fanout.1";
//
//    @Bean
//    public Queue aMessage() {
//        return new Queue(fanout_queueName_fanoutA);
//    }
//
//    @Bean
//    public Queue bMessage() {
//        return new Queue(fanout_queueName_fanoutB);
//    }
//
//    @Bean
//    public Queue cMessage() {
//        return new Queue(fanout_queueName_fanoutC);
//    }
//
//
//    /**
//     * Fanout 就是我们熟悉的广播模式或者订阅模式，给Fanout交换机发送消息，绑定了这个交换机的所有队列都收到这个消息。
//     *
//     * @author by MengYi at 2019-01-07 23:29
//    */
//    @Bean
//    public FanoutExchange fanoutExchange() {
//        return new FanoutExchange(fanout_exchange_name);
//    }
//
//    @Bean
//    public Binding bindingExchangeA(Queue aMessage, FanoutExchange fanoutExchange) {
//        return BindingBuilder.bind(aMessage).to(fanoutExchange);
//    }
//    @Bean
//    public Binding bindingExchangeB(Queue bMessage, FanoutExchange fanoutExchange) {
//        return BindingBuilder.bind(bMessage).to(fanoutExchange);
//    }
//    @Bean
//    public Binding bindingExchangeC(Queue cMessage, FanoutExchange fanoutExchange) {
//        return BindingBuilder.bind(cMessage).to(fanoutExchange);
//    }
//
//
//}
