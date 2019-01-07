package com.fairyoo.fring.web.controller;

import com.fairyoo.fring.rabbit.hello.HelloRabbitSender;
import com.fairyoo.fring.web.dtoout.CityOut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
     * helloRabbitSender
     *
     * @param
     * @return 城市实体
     * @author by MengYi at 2018-12-27 20:08
     */
    @ApiOperation(value = "helloSender")
    @PostMapping(value = "/helloSender/{message}")
    public void helloSender(@PathVariable("message") String message) {

        helloRabbitSender.send(message);
    }
}
