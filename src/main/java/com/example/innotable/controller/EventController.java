package com.example.innotable.controller;

import com.example.innotable.model.Event;
import com.example.innotable.repository.EventRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventRepository repository;

    public EventController(EventRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    private Event createEvent(@RequestBody Event event) {
        System.out.println(event);
        return event;
    }

    @GetMapping
    public Event getEvent(@RequestParam Long id) {
        return repository.getEvent(id);
    }

    @PutMapping
    public void putEvent(@RequestParam Long id, @RequestBody Event event) {
         repository.updateEvent(id, event);
    }
}
