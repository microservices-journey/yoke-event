package com.epam.yoke.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface NotifierProcessor {
    String OUTPUT_CREATE_EVENT = "createEvent";
    String OUTPUT_DELETE_EVENT = "deleteEvent";

    @Output(OUTPUT_CREATE_EVENT)
    MessageChannel createEvent();

    @Output(OUTPUT_DELETE_EVENT)
    MessageChannel deleteEvent();
}
