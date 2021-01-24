package com.epam.yoke.event.service;

import com.epam.yoke.event.NotifierProcessor;
import com.epam.yoke.event.model.rq.NotifyEventBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(NotifierProcessor.class)
public class StreamService {

    @Autowired
    private NotifierProcessor notifierProcessor;

    public void createEvent(NotifyEventBody event) {
        notifierProcessor.createEvent().send(MessageBuilder.withPayload(event).build());
    }

    public void deleteEvent(String eventId) {
        notifierProcessor.deleteEvent().send(MessageBuilder.withPayload(eventId).build());
    }
}
