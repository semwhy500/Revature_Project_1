package com.revature.ericschmidt.p1.ticketingapi.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.revature.ericschmidt.p1.ticketingapi.model.Event;

@WebService(serviceName = "event-service", targetNamespace = "http://service.ticketingapi.p1.ericschmidt.revature.com/")
@Component
public interface EventService {

	@WebMethod
	public List<Event> getEvents();
	@WebMethod
	public Event addEvent(Event event);
	@WebMethod
	public Event getEventById(int EVENTID);
	@WebMethod
	public Event delete(int EVENTID);
	
}
