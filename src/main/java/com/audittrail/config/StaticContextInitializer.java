package com.audittrail.config;

import com.audittrail.service.CacheService;
import com.audittrail.utils.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StaticContextInitializer {
    @Autowired
    private CacheService cacheService;
    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void init() {
        CacheUtils.setMyConfig(cacheService);
    }
}