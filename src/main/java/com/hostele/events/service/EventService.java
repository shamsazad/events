package com.hostele.events.service;

import com.hostele.events.model.Event;
import com.hostele.events.repository.EventRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    public ResponseEntity<Object> save(Event event) {
        eventRepository.saveAndFlush(event);
        return null;
    }

    public void find() {
    }
}
