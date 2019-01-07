package com.fairyoo.fring.rabbit.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author MengYi at 2019-01-07 14:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloRabbitSenderTest {



    @Autowired
    private HelloRabbitSender helloRabbitSender;

    @Test
    public void helloSender() throws Exception {

        helloRabbitSender.send("HelloRabbitSenderTest");
    }
}
