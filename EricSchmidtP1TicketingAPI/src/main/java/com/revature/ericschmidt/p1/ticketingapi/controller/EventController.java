package com.revature.ericschmidt.p1.ticketingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ericschmidt.p1.ticketingapi.model.Event;
import com.revature.ericschmidt.p1.ticketingapi.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	private EventService eventService;

	@GetMapping("/findAll")
	public List<Event> getSoapMessage() {
		return this.eventService.findAll();
	}

	@PutMapping("/save")
	public Event saveEvent(@RequestBody Event event) {
		return eventService.save(event);
	}

}
