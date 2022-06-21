package com.example.innotable.repository;

import com.example.innotable.model.Event;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EventRepository {

    private static final Map<Long, Event> storage = new HashMap<>();

    private static long counter = 0l;

    public void createEvent(Event event) {
        long id = ++counter;
        event.setId(id);
        storage.put(id, event);
    }

    public Event getEvent(Long id) {
        return storage.get(id);
    }

    public void updateEvent(Long id, Event event) {
        if (getEvent(id) == null)
            throw new IllegalArgumentException("event with such id does not exist: " + id);
        storage.put(id, event);
    }

    public void removeEvent(Long id) {
        storage.remove(id);
    }
}
