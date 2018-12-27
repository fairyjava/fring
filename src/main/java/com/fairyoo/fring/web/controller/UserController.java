package com.fairyoo.fring.web.controller;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *   https://www.bysocket.com/?p=1929
 *
 * @author MengYi at 2018-12-26 21:19
 */
@Api(tags ="用户管理", value = "")
@RestController
@RequestMapping(value = "/user/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {



}
