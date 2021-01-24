package com.epam.yoke.event.actuator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class YokeNotifierHealthIndicator implements HealthIndicator {

    private static final String URL = "http://localhost:8082";

    @Value("${yoke.notify.url}")
    private String notifierUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Health health() {
        int status =
                restTemplate.exchange(notifierUrl + "/", HttpMethod.GET, RequestEntity.EMPTY, Object.class).getStatusCodeValue();
        if (status != 200) {
            log.warn("Failed to connect to: {}", URL);
            return Health.down()
                         .withDetail("error", "Unable to connect to " + notifierUrl)
                         .build();
        }

        return Health.up().build();
    }
}
