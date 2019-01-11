package com.fairyoo.fring.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MengYi at 2019-01-10 10:52
 */
@Api(tags = "docker", value = "docker")
@RestController
//@RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DockerController {

    @ApiOperation(value = "index")
    @GetMapping("/")
    public String index() {
        return  "Hello docker !";
    }
}
