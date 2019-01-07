package com.fairyoo.fring.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MengYi at 2019-01-04 18:03
 */
@Configuration
public class FringRabbitConfig {

    public static final String hello_queueName = "fring.queue.hello";

    @Bean
    public Queue helloQueue() {
        return new Queue(hello_queueName);
    }

}
