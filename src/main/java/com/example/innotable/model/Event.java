package com.example.innotable.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Event {
    private String name;

    private String description;

    private LocalDateTime dateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name + ":\n" + description + "\n" + dateTime;
    }
}
