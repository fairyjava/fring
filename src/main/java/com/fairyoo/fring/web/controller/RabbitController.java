package com.fairyoo.fring.web.controller;

import com.fairyoo.fring.rabbit.hello.HelloRabbitSender;
import com.fairyoo.fring.web.dtoout.CityOut;
import com.fairyoo.fring.web.dtoout.UserOut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author MengYi at 2019-01-07 14:24
 */
@Api(tags = "rabbit mq", value = "")
@RestController
@RequestMapping(value = "/fring/rabbit", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RabbitController {

    @Autowired
    private HelloRabbitSender helloRabbitSender;

    /**
     * hello：发送字符串
     *
     * @param message
     * @author by MengYi at 2018-12-27 20:08
     */
    @ApiOperation(value = "helloSenderString")
    @PostMapping(value = "/hello/sendString/{message}")
    public void helloSenderString(@PathVariable("message") String message) throws IOException {

        helloRabbitSender.sendString(message);
    }


    /**
     * hello：发送 user dto
     *
     * @param user
     * @author by MengYi at 2018-12-27 20:08
     */
    @ApiOperation(value = "helloSenderDto")
    @PostMapping(value = "/hello/sendDto")
    public void helloSenderDto(@RequestBody UserOut user) throws IOException {

        helloRabbitSender.sendDto(user);
    }
}
