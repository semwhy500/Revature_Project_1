package com.revature.ericschmidt.p1.venueapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.ericschmidt.p1.venueapi.model.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Integer> {

	public List<Venue> findAll();

	public <S extends Venue> S save(Venue venue);
	
	public Venue getVenueByVENUEID(int VENUEID);
	
	public void delete(Venue venue);
	
}
