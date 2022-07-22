package com.revature.ericschmidt.p1.eventapi.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.revature.ericschmidt.p1.eventapi.model.Event;

@WebService
public interface EventService {

	public List<Event> getEvents();
	public Event addEvent(@WebParam(name="eventDetails") Event event);
	public void delete(int EVENTID);
	public Event getEventById(int EVENTID);

}