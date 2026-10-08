package com.example.eventplanner.repository;

import com.example.eventplanner.entity.EventOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventOptionRepository
        extends JpaRepository<EventOption, Long> {

    List<EventOption> findByEventId(Long eventId);
}
