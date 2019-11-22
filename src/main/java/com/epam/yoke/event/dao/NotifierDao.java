package com.epam.yoke.event.dao;

import com.epam.yoke.event.model.rs.NotifyEvent;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NotifierDao {

  @Value("${yoke.notify.url}")
  private String notifierUrl;

  @Autowired
  private RestTemplate restTemplate;

  public List<NotifyEvent> retrieveNotifyEvents() {
    return (List<NotifyEvent>) restTemplate.getForObject(notifierUrl + "/", Object.class);
  }
}
