package com.audittrail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "aware")
class JpaConfig {

    // hard code return value of user id is Administrator
    @Bean
    public AuditorAware<String> aware() {
//        return () -> Optional.of("user");
        return () -> Optional.of("Administrator");
    }
}