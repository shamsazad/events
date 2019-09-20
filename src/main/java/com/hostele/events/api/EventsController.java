package com.hostele.events.api;

import com.hostele.events.model.Event;
import com.hostele.events.service.EventService;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Controller
@RequestMapping("/events")
@Validated
public class EventsController {


    private EventService eventService;

    public EventsController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/create-event")
    public RequestEntity<Object> createEvent(@Valid @RequestBody Event event) {
        eventService.save(event);
        return null;
    }

    @GetMapping("/find-events")
    public RequestEntity<Object> findEvents(@Valid @Min(-180) @Max(180) Double longitude,
                                            @Valid @Min(-90) @Max(90) Double latitude) {

        eventService.find();
        return null;
    }
}
