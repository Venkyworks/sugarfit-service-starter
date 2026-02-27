
package com.sugarfit.starter.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RequestIdGenerator {
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
