package com.audittrail.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CacheService {
    private final ObjectMapper objectMapperDisableUnknownProperties;
    // example get data in redis
    private final RedisTemplate<String, String> redisTemplate;
    public String getCache() {
        return redisTemplate.opsForValue().get("KeyOfRedis");
//        return "Hello from redis";
    }

    public Object getObjectCache() throws JsonProcessingException {
        return objectMapperDisableUnknownProperties.readValue(redisTemplate.opsForValue().get("KeyOfRedis"), Object.class);
    }
}
