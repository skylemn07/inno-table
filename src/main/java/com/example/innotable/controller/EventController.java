package com.example.innotable.controller;

import com.example.innotable.model.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    @PostMapping
    private Event createEvent(@RequestBody Event event) {
        System.out.println(event);
        return event;
    }
}
