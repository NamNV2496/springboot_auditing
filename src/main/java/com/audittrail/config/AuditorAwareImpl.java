package com.audittrail.config;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuditorAwareImpl implements AuditorAware<String> {

    @Autowired
    private WebUtil webUtil;
    @SneakyThrows
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(webUtil.getToken());
    }
}