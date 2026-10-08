package com.example.eventplanner.service;

import com.example.eventplanner.entity.Event;
import com.example.eventplanner.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public Event findById(Long id) {

        return eventRepository
                .findById(id)
                .orElseThrow(
                        () -> new IllegalArgumentException(
                                "Event not found: " + id
                        )
                );
    }

    public Event create(Event event) {
        return eventRepository.save(event);
    }

    public void delete(Long id) {
        eventRepository.deleteById(id);
    }
}
