package com.itdevs.itike.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Event {


    public Event(@JsonProperty("event_id") UUID event_id,@JsonProperty("evenet_name") String evenet_name,@JsonProperty("organizer") String organizer) {
        this.event_id = event_id;
        this.evenet_name = evenet_name;
        this.organizer = organizer;
    }

    private UUID event_id;

    public UUID getEvent_id() {
        return event_id;
    }

    public String getEvenet_name() {
        return evenet_name;
    }

    public String getOrganizer() {
        return organizer;
    }

    private String evenet_name;
     private String organizer;
}
