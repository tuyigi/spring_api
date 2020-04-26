package com.itdevs.itike.controller;

import com.itdevs.itike.model.Event;
import com.itdevs.itike.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/event")
@RestController
public class EventController {

    @Autowired
    public EventService eventService;


   @PostMapping
    void insertEvent(@RequestBody Event event){
        eventService.insertEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvent(){
        return eventService.getAllEvent();
    }

    @PutMapping
    public String status(){
       return eventService.status();
    }
}
