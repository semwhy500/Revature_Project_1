package com.revature.ericschmidt.p1.eventapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ericschmidt.p1.eventapi.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{

	public List<Event> findAll();
	public <S extends Event> S save(Event event);
	public void delete(Event event);
	public Event findById(int EVENTID);
	
}