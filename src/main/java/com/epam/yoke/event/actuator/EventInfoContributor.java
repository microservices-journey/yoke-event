package com.epam.yoke.event.actuator;

import com.epam.yoke.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class EventInfoContributor implements InfoContributor {

    @Autowired
    private EventService eventService;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("eventCount", eventService.countCreatedRecords());
    }
}
