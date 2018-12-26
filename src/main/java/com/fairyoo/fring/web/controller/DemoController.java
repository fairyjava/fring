package com.fairyoo.fring.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MengYi at 2018-12-26 14:45
 */
@RestController(value = "/demo")
public class DemoController {

    /**
     * hello
     *
     * @author by MengYi at 2018-12-26 14:47
    */
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
