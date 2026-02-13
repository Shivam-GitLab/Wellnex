package com.sm.wellnex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health")
    public String healthCheck() {
        return "Health check successful! The application is running.";
    }
}
