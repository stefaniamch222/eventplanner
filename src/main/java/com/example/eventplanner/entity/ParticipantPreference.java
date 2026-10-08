package com.example.eventplanner.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "participant_preferences")
public class ParticipantPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String participantName;

    private String participantEmail;

    @ManyToOne(optional = false)
    private EventOption eventOption;

    @Enumerated(EnumType.STRING)
    private Availability availability;

    public ParticipantPreference() {
    }

    public Long getId() {
        return id;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantEmail() {
        return participantEmail;
    }

    public void setParticipantEmail(String participantEmail) {
        this.participantEmail = participantEmail;
    }

    public EventOption getEventOption() {
        return eventOption;
    }

    public void setEventOption(EventOption eventOption) {
        this.eventOption = eventOption;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }
}
