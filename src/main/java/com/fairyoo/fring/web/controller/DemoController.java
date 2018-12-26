package com.fairyoo.fring.web.controller;


import com.fairyoo.fring.configs.FringApiProperty;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * 只需要类添加  @RestController  即可，默认类中的方法都会以json的格式返回.
 * 注意：@RestController(value = "/demo/v1") 会异常
 *
 * @author MengYi at 2018-12-26 14:45
 */
@RestController
@RequestMapping(value = "/demo/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoController {

    /**
     * application.properties中：com.fairyoo.fring
     *
     * @author by MengYi at 2018-12-26 15:57
    */
    @Autowired
    private FringApiProperty fringApiProperty;

    /**
     * hello
     *
     * @author by MengYi at 2018-12-26 14:47
     */
    @GetMapping("/hello")
    public String hello() {
        var name = fringApiProperty.getName();
        var desc = fringApiProperty.getDescription();
        return name + ": " + desc;
    }

    /**
     * uid
     *
     * @author by MengYi at 2018-12-26 15:24
     */
    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }




}
