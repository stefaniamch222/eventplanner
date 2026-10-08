package com.example.eventplanner.service;

import com.example.eventplanner.entity.Event;
import com.example.eventplanner.repository.EventRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EventServiceTest {

    @Mock
    private EventRepository eventRepository;

    @InjectMocks
    private EventService eventService;

    private Event event;

    @BeforeEach
    void setUp() {
        event = new Event();
        event.setTitle("Cena Aziendale");
        event.setDescription("Cena di fine anno");
        event.setOrganizerName("Mario Rossi");
        event.setOrganizerEmail("mario@example.com");
    }

    @Test
    void shouldCreateEventSuccessfully() {
        when(eventRepository.save(any(Event.class))).thenReturn(event);

        Event created = eventService.create(event);

        assertNotNull(created);
        assertEquals("Cena Aziendale", created.getTitle());
        verify(eventRepository, times(1)).save(event);
    }

    @Test
    void shouldFindEventByIdWhenExists() {
        when(eventRepository.findById(1L)).thenReturn(Optional.of(event));

        Event found = eventService.findById(1L);

        assertNotNull(found);
        assertEquals("Cena Aziendale", found.getTitle());
    }

    @Test
    void shouldThrowExceptionWhenEventNotFound() {
        when(eventRepository.findById(99L)).thenReturn(Optional.empty());

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> eventService.findById(99L)
        );

        assertTrue(exception.getMessage().contains("Event not found"));
    }
}