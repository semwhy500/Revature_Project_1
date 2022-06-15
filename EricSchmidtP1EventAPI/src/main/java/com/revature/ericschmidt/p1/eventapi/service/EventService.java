package com.revature.ericschmidt.p1.eventapi.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.revature.ericschmidt.p1.eventapi.model.Event;

@WebService
public interface EventService {

	public List<Event> findAll();
	public Event save(@WebParam(name="eventDetails") Event event);

}