package com.rungroup.springMVC.service;

import com.rungroup.springMVC.dto.ClubDto;
import com.rungroup.springMVC.dto.EventDto;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);

    void updateEvent(EventDto event);

    void deleteEvent(Long eventId);
}
