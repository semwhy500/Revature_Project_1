package com.revature.ericschmidt.p1.ticketingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.revature.ericschmidt.p1.ticketingapi.model.Venue;

@RestController
public class VenueController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/venues/getvenues")
	public List<Venue> getVenue() {
		ResponseEntity<List> venue = restTemplate.getForEntity("http://localhost:8082/venues/getvenues", List.class);
		List<Venue> venueList = venue.getBody();
		return venueList;
	}
	
	@PostMapping("/venues/addvenue")
	public Venue save(@RequestBody Venue venue) {
		ResponseEntity<Venue> response = restTemplate.postForEntity("http://localhost:8082/venues/addvenue", venue, Venue.class);
		return response.getBody();
	}
	
}
