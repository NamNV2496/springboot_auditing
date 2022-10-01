package com.audittrail.config;

import com.audittrail.domain.ItemTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "aware")
class JpaConfig {

    @Bean
    public AuditorAware<String> aware() {
//        Read username from token
        return new AuditorAwareImpl();
    // hard code return value of user id is Administrator
//        return () -> Optional.of("Administrator");
    }
}