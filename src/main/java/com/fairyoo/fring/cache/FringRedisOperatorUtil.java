package com.fairyoo.fring.cache;

import com.fairyoo.fring.util.FringJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * redis基本操作工具
 *
 * @author MengYi at 2018-12-29 09:46
 */
public class FringRedisOperatorUtil {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    public FringRedisOperatorUtil(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 一周有多少秒
     */
    private static final long WEEK_SECONDS = 60 * 60;


    /**
     * 将 key，value 存放到redis数据库中，默认设置过期时间为1小时
     *
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value, WEEK_SECONDS, TimeUnit.SECONDS);
    }

    /**
     * 将 key，value 存放到redis数据库中，设置过期时间单位是秒
     *
     * @param key
     * @param value
     * @param expireTime
     */
    public void set(String key, String value, long expireTime) {
        redisTemplate.opsForValue().set(key, value, expireTime, TimeUnit.SECONDS);
    }

    /**
     * 设置过期时间单位秒
     *
     * @param key
     * @param expireTime
     */
    public void expire(String key, long expireTime) {
        redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
    }

    /**
     * 判断 key 是否在 redis 数据库中
     *
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 获取与 key 对应的对象
     *
     * @param key
     * @param clazz 目标对象类型
     * @param <T>
     * @return
     */
    public <T> T get(String key, Class<T> clazz) {
        String s = get(key);
        if (s == null) {
            return null;
        }
        return FringJsonUtil.convertString2Obj(s, clazz);
    }

    /**
     * 获取 key 对应的字符串
     *
     * @param key
     * @return
     */
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 删除 key 对应的 value
     *
     * @param key
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    /**
     * @param key
     * @param value
     * @param seconds 单位秒
     */
    public Long lpush(String key, String value, int seconds) {
        Long redisValue = redisTemplate.opsForList().leftPush(key, value);
        if (seconds > 0) {
            expire(key, seconds);
        }
        return redisValue;
    }

    /**
     * @param key
     * @param value
     * @param seconds 单位秒
     */
    public Long lpush(String key, int seconds, String... value) {
        Long redisValue = redisTemplate.opsForList().leftPushAll(key, value);
        if (seconds > 0) {
            expire(key, seconds);
        }
        return redisValue;
    }

    /**
     * 取出List中的一个数据并删除，取出的是最后存的数据
     *
     * @param key
     * @return
     */
    public String lpup(String key) {

        return redisTemplate.opsForList().leftPop(key);
    }

    /**
     * 取出List中的一个数据并删除，取出的是最先存的数据
     *
     * @param key
     * @return
     */
    public String rpop(String key) {
        return redisTemplate.opsForList().rightPop(key);
    }

    /**
     * 获取
     * @param key
     * @return
     */
    public Long listSize(String key) {
        return redisTemplate.opsForList().size(key);
    }

}
