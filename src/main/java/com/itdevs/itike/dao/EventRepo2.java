package com.itdevs.itike.dao;

import com.itdevs.itike.model.Event;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("EventDao2")
public class EventRepo2 implements EventDao {

    @Override
    public int insertEvent(UUID event_id, Event event) {
        return 0;
    }

    @Override
    public List<Event> getAllEvent() {
        return null;
    }
    @Override
    public String status() {
        return "from second dao";
    }
}
