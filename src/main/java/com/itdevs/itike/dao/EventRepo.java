package com.itdevs.itike.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itdevs.itike.model.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("EventRepo")
public class EventRepo implements EventDao{

    private static List<Event> db=new ArrayList<>();

    @Override
    public int insertEvent(UUID event_id, Event event) {
        db.add(new Event(event_id,event.getEvenet_name(),event.getOrganizer()));
        return 1;
    }

    @Override
    public List<Event> getAllEvent() {
        return db;
    }

    @Override
    public String status() {
        return "from first dao";
    }
}
