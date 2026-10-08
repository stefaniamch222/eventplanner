package com.example.eventplanner.repository;

import com.example.eventplanner.entity.ParticipantPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantPreferenceRepository
        extends JpaRepository<ParticipantPreference, Long> {
}
