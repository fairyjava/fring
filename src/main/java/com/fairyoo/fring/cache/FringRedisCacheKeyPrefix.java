package com.fairyoo.fring.cache;

import org.springframework.data.redis.cache.CacheKeyPrefix;

/**
 * Redis 缓存key的前缀
 *
 * @author MengYi at 2018-12-28 17:14
 */
public class FringRedisCacheKeyPrefix implements CacheKeyPrefix {

    private String prefix;

    public FringRedisCacheKeyPrefix(String prefix){
        super();
        this.prefix = prefix;
    }

    @Override
    public String compute(String cacheName) {

        if( this.prefix == null) {
            return cacheName.concat(":");
        }

        return  this.prefix.concat(":").concat(cacheName).concat(":");
    }
}
