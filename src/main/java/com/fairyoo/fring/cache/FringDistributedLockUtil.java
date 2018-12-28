package com.fairyoo.fring.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author MengYi at 2018-12-28 23:06
 */
@Component
public class FringDistributedLockUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    /** 分布式锁超时时间 60s*/
    private static final int LOCK_DEFAULT_EXPIRE_TIME = 60;


    /**
     * 锁
     *
     * @param key
     * @param timeOutSecond
     * @return
     */
    public boolean lock(String key, Integer timeOutSecond) {
        Boolean lockSuccess = redisTemplate.opsForValue().setIfAbsent(key, "1");
        if (lockSuccess) {
            // 设置锁的超时时间
            redisTemplate.expire(key, timeOutSecond, TimeUnit.SECONDS);
        }
        return lockSuccess;
    }

    /**
     * 锁
     *
     * @param key
     * @return
     */
    public boolean lock(String key) {
        return lock(key, LOCK_DEFAULT_EXPIRE_TIME);
    }

    /**
     * 解锁
     * @param key
     */
    public void unlock(String key) {
        redisTemplate.delete(key);
    }

}
