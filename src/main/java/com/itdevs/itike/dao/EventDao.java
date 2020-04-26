package com.itdevs.itike.dao;

import com.itdevs.itike.model.Event;

import java.util.List;
import java.util.UUID;

public interface EventDao {

    int insertEvent(UUID event_id, Event event);

    default int insertEvent(Event event){
        UUID id=UUID.randomUUID();
        return insertEvent(id,event);
    }

    List<Event> getAllEvent();

    String status();

}
