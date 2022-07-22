package com.revature.ericschmidt.p1.eventapi.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.ericschmidt.p1.eventapi.model.Event;
import com.revature.ericschmidt.p1.eventapi.repository.EventRepository;

@WebService(endpointInterface = "com.revature.ericschmidt.p1.eventapi.service.EventService")
public class EventServiceImpl implements EventService {

	private EventRepository eventRepository;

	public EventServiceImpl() {}
	
	public EventServiceImpl (EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}

	@Autowired
	public void setEventRepository(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	@WebMethod
	public List<Event> getEvents(){
		return this.eventRepository.findAll();
	}

	@WebMethod
	public Event addEvent(Event event) {
		return this.eventRepository.save(event);
		
	}
	
	@Override
	public void delete(int EVENTID) {
		List<Event> events = this.eventRepository.findAll();
		for(Event event : events) {
			if(event.getEVENTID() == EVENTID) {
				this.eventRepository.delete(event);
			}
		}
	}
	
	@Override
	public Event getEventById(int EVENTID) {
		return this.eventRepository.findById(EVENTID);
	}

}