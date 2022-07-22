package com.revature.ericschmidt.p1.ticketingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ericschmidt.p1.ticketingapi.model.Event;
import com.revature.ericschmidt.p1.ticketingapi.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService eventService;

	@GetMapping("/getEvents")
	public List<Event> getSoapMessage() {
		return this.eventService.getEvents();
	}

	@PutMapping("/addEvent")
	public Event saveEvent(@RequestBody Event event) {
		return eventService.addEvent(event);
	}
	
	@GetMapping("/{EVENTID}")
	public Event getEventById(@PathVariable int EVENTID) {
		return this.eventService.getEventById(EVENTID);
	}
	
	@DeleteMapping("/delete/{EVENTID}")
	public Event delete(@PathVariable int EVENTID) {
		return this.eventService.delete(EVENTID);
		
	}

}
