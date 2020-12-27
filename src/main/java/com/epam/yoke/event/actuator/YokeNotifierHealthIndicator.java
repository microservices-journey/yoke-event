package com.epam.yoke.event.actuator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.Socket;

@Component
@Slf4j
public class YokeNotifierHealthIndicator implements HealthIndicator {

    private static final String URL = "http://localhost:8082";

    @Override
    public Health health() {
        try (Socket socket =
                     new Socket(InetAddress.getLocalHost().getHostName(), 8082)) {
        } catch (Exception e) {
            log.warn("Failed to connect to: {}", URL);
            return Health.down()
                    .withDetail("error", e.getMessage())
                    .build();
        }
        return Health.up().build();
    }
}
