package com.epam.yoke.event.service;

import com.epam.yoke.event.dao.NotifierDao;
import com.epam.yoke.event.model.rq.NotifyEventBody;
import com.epam.yoke.event.model.rs.NotifyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotifyService {

    private static final Logger logger = LoggerFactory.getLogger(NotifyService.class);

    private NotifierDao notifierDao;
    private StreamService streamService;

    @Autowired
    public NotifyService(NotifierDao notifierDao, StreamService streamService) {
        this.notifierDao = notifierDao;
        this.streamService = streamService;
    }

    public List<NotifyEvent> getEvents() {
        return notifierDao.retrieveNotifyEvents();
    }

    public void deleteEvent(String eventId) {
        streamService.deleteEvent(eventId);
    }

    public void createEvent(Long eventId, String description) {
        NotifyEventBody event = new NotifyEventBody();
        event.setEventId(String.valueOf(eventId));
        event.setDescription(description);
        streamService.createEvent(event);
        logger.info("Created event for the notifier");
    }
}
