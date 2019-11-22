package com.epam.yoke.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.yoke.event.dao.NotifierDao;
import com.epam.yoke.event.model.rs.NotifyEvent;

@Component
public class NotifyService {

  @Autowired
  private NotifierDao notifierDao;

  public List<NotifyEvent> getEvents() {
    return notifierDao.retrieveNotifyEvents();
  }
}
