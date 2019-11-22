package com.epam.yoke.event.mapper;

import com.epam.yoke.event.model.stream.StreamEvent;
import java.util.List;

import org.mapstruct.Mapper;

import com.epam.yoke.event.entity.Event;
import com.epam.yoke.event.model.rq.EventBody;
import com.epam.yoke.event.model.rs.EventResponse;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventMapper {

  EventResponse mapResponse(Event source);

  List<EventResponse> mapResponses(List<Event> source);

  Event mapRequest(EventBody source);

  @Mapping(target = "eventId", source = "id")
  StreamEvent mapEntityEvent(Event source);
}
