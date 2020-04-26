package com.itdevs.itike.service;

import com.itdevs.itike.dao.EventDao;
import com.itdevs.itike.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    @Qualifier("EventRepo")
    private EventDao eventDao;

    public int insertEvent(Event event){
        return eventDao.insertEvent(event);
    }

    public List<Event> getAllEvent(){
        return eventDao.getAllEvent();
    }

    public String status(){
        return eventDao.status();
    }

}
