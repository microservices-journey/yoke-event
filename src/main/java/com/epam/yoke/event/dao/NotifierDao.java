package com.epam.yoke.event.dao;

import com.epam.yoke.event.model.rq.NotifyEventBody;
import com.epam.yoke.event.model.rs.NotifyEvent;
import com.epam.yoke.event.model.rs.NotifyEventResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class NotifierDao {

    @Value("${yoke.notify.url}")
    private String notifierUrl;

    @Autowired
    private RestTemplate restTemplate;

    public List<NotifyEvent> retrieveNotifyEvents() {
        return (List<NotifyEvent>) restTemplate.getForObject(notifierUrl + "/", Object.class);
    }

    public void deleteEvent(String eventId) {
        restTemplate.delete(notifierUrl + "/" + eventId);
    }

    public NotifyEventResponse createEvent(NotifyEventBody event) {
        ResponseEntity<NotifyEventResponse> response = restTemplate.postForEntity(notifierUrl + "/", event, NotifyEventResponse.class);
        return response.getBody();
    }
}
