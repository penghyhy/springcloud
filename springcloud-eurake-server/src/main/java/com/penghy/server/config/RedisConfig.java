package com.penghy.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

	@Bean
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		// 配置redisTemplate
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
		redisTemplate.setConnectionFactory(redisConnectionFactory);
		RedisSerializer stringSerializer = new StringRedisSerializer();
		redisTemplate.setKeySerializer(stringSerializer); // key序列化
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer()); // value序列化
		redisTemplate.setHashKeySerializer(stringSerializer); // Hash key序列化
		redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer()); // Hash value序列化
		redisTemplate.afterPropertiesSet();
		return redisTemplate;

	}

//	@Bean
//	public RedisTemplate<Object, Object> redisTemplate() throws UnknownHostException {
//		RedisTemplate<Object, Object> redisTemplate = new RedisTemplate();
//		redisTemplate.setConnectionFactory(jedisConnectionFactory());
//
//		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//		ObjectMapper om = new ObjectMapper();
//		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//		jackson2JsonRedisSerializer.setObjectMapper(om);
//
//		// 设置value序列化采用jackson2JsonRedisSerializer
//		redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
//		// 设置key序列化采用StringRedisSerializer
//		redisTemplate.setKeySerializer(new StringRedisSerializer());
//
//		redisTemplate.afterPropertiesSet();
//		return redisTemplate;
//	}
}
