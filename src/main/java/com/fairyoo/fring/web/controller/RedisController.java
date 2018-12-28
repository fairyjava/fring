package com.fairyoo.fring.web.controller;

import com.fairyoo.fring.cache.FringDistributedLockUtil;
import com.fairyoo.fring.cache.FringRedisCacheConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author MengYi at 2018-12-28 23:33
 */
@Api(tags = "Redis", value = "")
@RestController
@RequestMapping(value = "/fring/api/v1/redis", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RedisController {

    /** 缓存锁工具类 */
    @Autowired
    private FringDistributedLockUtil fringDistributedLockUtil;


    /**
     * 防止重复的action（并发、定时任务同时执行）
     *
     * @param
     * @return
     * @author by MengYi at 2018-12-28 23:37
    */
    @ApiOperation(value = "防止重复的action（并发、定时任务同时执行）")
    @PostMapping(value = "/action")
    public String action(@Valid @RequestParam String messageId) {
        // 防止重复发送（并发、定时任务同时执行）
        if(!fringDistributedLockUtil.lock(FringRedisCacheConstant.KEY_PRE_SEND_MSG + messageId)){

            return "正在执行";
        }

        //TODO action


        fringDistributedLockUtil.unlock(FringRedisCacheConstant.KEY_PRE_SEND_MSG + messageId);

        return "执行完成";
    }

}
