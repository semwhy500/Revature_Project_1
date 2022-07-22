package com.revature.ericschmidt.p1.venueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.ericschmidt.p1.venueapi.model.Venue;
import com.revature.ericschmidt.p1.venueapi.repository.VenueRepository;

@Service
public class VenueServiceImpl implements VenueService{

	@Autowired
	private VenueRepository venueRepository;
	
	@Override
	public List<Venue> findAll() {
		return venueRepository.findAll();
	}

	@Override
	public Venue save(Venue venue) {
		return venueRepository.save(venue);
	}
	
	@Override
	public Venue getVenueByVENUEID(int VENUEID) {
		return this.venueRepository.getVenueByVENUEID(VENUEID);
	}
	
	@Override
	public void delete(Venue venue) {
		this.venueRepository.delete(venue);
	}
	
}
