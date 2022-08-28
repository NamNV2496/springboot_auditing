package com.audittrail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class AuditTrailApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditTrailApplication.class, args);
    }

}
