package com.revature.ericschmidt.p1.venueapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.ericschmidt.p1.venueapi.model.Venue;

@Service
public interface VenueService {

	public List<Venue> findAll();
	public Venue save(Venue venue);
	
}
