package com.fairyoo.fring.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MengYi at 2019-01-07 16:42
 */
@Configuration
public class FringRabbitTopicConfig {

    public final static String topic_queueName1 = "fring.queueName.topic.message1";

    public final static String topic_queueName2 = "fring.queueName.topic.message2";

    public final static String topic_routingKey1 = "fring.routingKey.topic.message1";
    public final static String topic_routingKey2 = "fring.routingKey.topic.message2";

    public final static String topic_exchangeName = "fring.exchangeName.topic";


    /**
     * 队列1
     */
    @Bean
    public Queue queueMessage1() {
        return new Queue(topic_queueName1);
    }

    /**
     * 队列2
     */
    @Bean
    public Queue queueMessage2() {
        return new Queue(topic_queueName2);
    }

    /**
     * exchangeName
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange(topic_exchangeName);
    }


    @Bean
    public Binding bindingExchangeMessage1(Queue queueMessage1, TopicExchange topicExchange) {
        return BindingBuilder.bind(queueMessage1).to(topicExchange).with(topic_routingKey1);
    }

    @Bean
    public Binding bindingExchangeMessage2(Queue queueMessage2, TopicExchange topicExchange) {
        return BindingBuilder.bind(queueMessage2).to(topicExchange).with(topic_routingKey2);
    }

}
