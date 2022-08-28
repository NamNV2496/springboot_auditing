//package com.audittrail.config;
//
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.data.domain.AuditorAware;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//
//@EnableJpaAuditing
//public class JpaConfiguration implements AuditorAware<String> {
//
//    // in case setup security please use this configuration to get current user
//
//    public SecurityProperties.User getCurrentAuditor() {
//
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication == null || !authentication.isAuthenticated()) {
//            return null;
//        }
//
//        return ((MyUserDetails) authentication.getPrincipal()).getUser();
//    }
//}
