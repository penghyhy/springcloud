package com.penghy.server.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    private static RedisTemplate<Object, Object> redisTemplate;
    private static Integer EXPIRE = 86400;

    @Autowired
    public RedisUtil(RedisTemplate redisTemplate) {
        RedisUtil.redisTemplate = redisTemplate;
    }

    // 获取连接
    @SuppressWarnings("unchecked")
    private static RedisTemplate<Object, Object> getRedis() {
        /**
         if (redisTemplate == null) {
         synchronized (RedisUtil.class) {
         if (redisTemplate == null) {
         redisTemplate = (RedisTemplate<Object, Object>) SpringContextUtil.getBean("redisTemplate");
         }
         }
         }**/
        return redisTemplate;
    }

    /**
     * 设置缓存 缓存没有失效时间
     */
    public static final void setNoExpiry(final String key, final Serializable value) {
        getRedis().opsForValue().set(key, value);
    }

    /**
     * 查询缓存 缓存没有失效时间
     */
    public static final Object getNoExpiry(final String key) {
        return getRedis().opsForValue().get(key);
    }

    /**
     * 获取redis所有key值
     *
     * @return
     */
    public static final List<String> getAllRedisKeys() {
        List<String> keys = new ArrayList<>();
        Set<Object> redisSet = getRedis().keys("*");
        Iterator<Object> it = redisSet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            keys.add(key);
        }
        return keys;
    }

    /**
     * 获取redis 中指定头的所有key
     *
     * @return
     */
    public static final List<String> getHeadRedisKeys(String inputKey) {
        List<String> keys = new ArrayList<>();
        Set<Object> redisSet = getRedis().keys(inputKey + "*");
        Iterator<Object> it = redisSet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            keys.add(key);
        }
        return keys;
    }

    public static final boolean hasKey(final String inputKey) {
        Set<Object> redisSet = getRedis().keys(inputKey);
        Iterator<Object> it = redisSet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (key.equals(inputKey)) {
                return true;
            }
        }
        return false;
    }


    public static final Object get(final String key) {
        expire(key, EXPIRE);
        return getRedis().opsForValue().get(key);
    }

    public static final void set(final String key, final Serializable value) {
        getRedis().opsForValue().set(key, value);
        expire(key, EXPIRE);
    }

    public static final Object get(final String key, final int seconds) {
        expire(key, seconds);
        return getRedis().opsForValue().get(key);
    }

    public static final void set(final String key, final Serializable value, final int seconds) {
        getRedis().opsForValue().set(key, value);
        expire(key, seconds);
    }

    public static final Boolean exists(final String key) {
        expire(key, EXPIRE);
        return getRedis().hasKey(key);
    }

    public static final void del(final String key) {
        getRedis().delete(key);
    }

    public static final String type(final String key) {
        expire(key, EXPIRE);
        return getRedis().type(key).getClass().getName();
    }

    /**
     * 在某段时间后失效
     *
     * @return
     */
    public static final Boolean expire(final String key, final int seconds) {
        return getRedis().expire(key, seconds, TimeUnit.SECONDS);
    }

    /**
     * 在某个时间点失效
     *
     * @param key
     * @param unixTime
     * @return
     */
    public static final Boolean expireAt(final String key, final long unixTime) {
        return getRedis().expireAt(key, new Date(unixTime));
    }

    public static final Long ttl(final String key) {
        return getRedis().getExpire(key, TimeUnit.SECONDS);
    }

    public static final void setrange(final String key, final long offset, final String value) {
        expire(key, EXPIRE);
        getRedis().boundValueOps(key).set(value, offset);
    }

    public static final String getrange(final String key, final long startOffset, final long endOffset) {
        expire(key, EXPIRE);
        return getRedis().boundValueOps(key).get(startOffset, endOffset);
    }

    public static final Object getSet(final String key, final String value) {
        expire(key, EXPIRE);
        return getRedis().boundValueOps(key).getAndSet(value);
    }

    // 清楚所有redis缓存
    public static final String flushDB() {
        return getRedis().execute((RedisConnection connection) -> {
            connection.flushDb();
            return "ok";
        });
    }
}
