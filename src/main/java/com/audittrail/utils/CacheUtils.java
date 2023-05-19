package com.audittrail.utils;

import com.audittrail.service.CacheService;

public class CacheUtils {
    private static CacheService cacheService;

    public static void setMyConfig(CacheService cacheService) {
        CacheUtils.cacheService = cacheService;
    }

    public static String getRedis() {

        // do anythings

        String cache = cacheService.getCache();
        if (cache.isEmpty()) {
            return "Read from redis fail";
        }
        return "Read from redis success";
    }
}
